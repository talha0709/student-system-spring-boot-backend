package com.Talha.StudentSystem.service;

import com.Talha.StudentSystem.model.student;

import java.util.List;

public interface StudentService {

    public student saveStudent(student student);
    public List<student> getAllStudents();
}
