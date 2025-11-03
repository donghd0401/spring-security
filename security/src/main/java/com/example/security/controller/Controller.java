package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api/v1/hello-world")
    public String helloWorld() {
        return "Hello world!";
    }
}
