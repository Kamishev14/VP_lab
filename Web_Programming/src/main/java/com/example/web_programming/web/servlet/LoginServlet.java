package com.example.web_programming.web.servlet;


import com.example.web_programming.service.AuthService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private final SpringTemplateEngine templateEngine;
    private final AuthService authService;

    public LoginServlet(SpringTemplateEngine templateEngine, AuthService authService) {
        this.templateEngine = templateEngine;
        this.authService = authService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IWebExchange iWebExchange = JakartaServletWebApplication
                .buildApplication(req.getServletContext())
                        .buildExchange(req,resp);

        WebContext context = new WebContext(iWebExchange);
        templateEngine.process("login.html", context,resp.getWriter());
    }
}
