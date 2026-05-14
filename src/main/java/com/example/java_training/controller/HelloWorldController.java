package com.example.java_training.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
    
}
