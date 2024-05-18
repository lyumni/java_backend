package com.yourcompany.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.yourcompany.model.Issue;

import com.yourcompany.service.IssueService;


import java.util.List;


@RestController

@RequestMapping("/api/issues")

public class IssueController {

    @Autowired

    private IssueService issueService;


    @GetMapping

    public List<Issue> getAllIssues() {

        return issueService.findAll();

    }


    @PostMapping

    public Issue createIssue(@RequestBody Issue issue) {

        return issueService.save(issue);

    }

}

