package com.Talha.StudentSystem.service;

import com.Talha.StudentSystem.model.student;
import com.Talha.StudentSystem.repositry.studentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImlimentation implements StudentService {

    @Autowired
    private studentRepositry studentRepositry;
    @Override
    public student saveStudent(student student) {
        return studentRepositry.save(student);
    }

    @Override
    public List<student> getAllStudents() {
        return studentRepositry.findAll();
    }
}
