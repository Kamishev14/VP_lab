package com.example.web_programming.bootstrap;

import com.example.web_programming.model.Category;
import com.example.web_programming.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        categories.add(new Category("Books", "Books category"));
        categories.add(new Category("Movies", "Movies category"));

        users.add(new User("kristijan.kamishev", "kk", "Kristijan", "Kamishev"));
        users.add(new User("riste.stojanov", "rs", "Riste", "Stojanov"));

    }
}
