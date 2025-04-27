package com.githubsearch.controller;

import com.githubsearch.service.GithubSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/search")
@CrossOrigin(origins = "*")
public class SearchController {

    @Autowired
    private GithubSearchService githubSearchService;

    @GetMapping
    public List<Map<String, Object>> searchCode(@RequestParam String query) {
        return githubSearchService.searchCode(query);
    }
} 
