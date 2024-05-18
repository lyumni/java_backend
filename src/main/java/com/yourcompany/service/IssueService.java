package com.yourcompany.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yourcompany.model.Issue;

import com.yourcompany.repository.IssueRepository;


import java.util.List;


@Service

public class IssueService {

    @Autowired

    private IssueRepository issueRepository;


    public List<Issue> findAll() {

        return issueRepository.findAll();

    }


    public Issue save(Issue issue) {

        return issueRepository.save(issue);

    }

}

