package com.example.web_programming.service;

import com.example.web_programming.model.User;

public interface AuthService {
    User login(String username, String password);
    User register(String username, String password, String repeatPassword, String name, String surname);

}
