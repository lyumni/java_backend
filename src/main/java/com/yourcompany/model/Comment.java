package com.yourcompany.model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;


@Entity

public class Comment {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Long issueId;

    private String content;


    // Getters and Setters

}

