package com.yourcompany.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.yourcompany.model.User;

import com.yourcompany.service.UserService;


@RestController

@RequestMapping("/api/users")

public class UserController {

    @Autowired

    private UserService userService;


    @PostMapping("/login")

    public User login(@RequestBody User user) {

        User existingUser = userService.findByUsername(user.getUsername());

        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {

            return existingUser;

        }

        return null;

    }


    @PostMapping("/register")

    public User register(@RequestBody User user) {

        return userService.save(user);

    }

}

