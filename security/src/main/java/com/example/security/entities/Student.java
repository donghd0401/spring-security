package com.example.security.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT")
@Entity
public class Student {
    @Id
    @Column(name = "STUDENT_ID")
    private Integer studentId;
    @Column(name = "STUDENT_NAME")
    private String studentName;
}
