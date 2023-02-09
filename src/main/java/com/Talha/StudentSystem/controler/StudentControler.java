package com.Talha.StudentSystem.controler;

import com.Talha.StudentSystem.model.student;
import com.Talha.StudentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentControler {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody student student){

           studentService.saveStudent(student);
           return "new student add";
    }
    @GetMapping("/getAll")
    public List<student> getAllStudents(){
       return studentService.getAllStudents();
    }
}
