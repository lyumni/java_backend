package com.yourcompany.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yourcompany.model.User;

import com.yourcompany.repository.UserRepository;


@Service

public class UserService {

    @Autowired

    private UserRepository userRepository;


    public User findByUsername(String username) {

        return userRepository.findByUsername(username);

    }


    public User save(User user) {

        return userRepository.save(user);

    }

}

