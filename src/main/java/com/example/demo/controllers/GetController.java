package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @GetMapping("/getAPI")
    public String msg()
    {
        return "API is running!";
    }

}
