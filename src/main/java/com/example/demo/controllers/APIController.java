package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/message")
    public String messageString(@RequestParam String source)
    {
        return "Welcome to Spring boot API!";
    }


    @GetMapping("/message1")
    public String message(@RequestParam String source)
    {
        return "Spring boot application is running!";
    }

}
