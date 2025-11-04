package com.example.security.controllers;

import com.example.security.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @Autowired
    private IStudentService service;

    @GetMapping("/student/{id}")
    public Object getStudentById(@PathVariable Integer id) {
        try {
            return service.getStudentById(id);
        } catch (NullPointerException e) {
            return ResponseEntity.notFound();
        }
    }
}
