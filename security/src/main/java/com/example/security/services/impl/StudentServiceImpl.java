package com.example.security.services.impl;

import com.example.security.entities.Student;
import com.example.security.repositories.StudentRepository;
import com.example.security.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> student = repository.findById(id);
        return student.orElse(null);
    }
}
