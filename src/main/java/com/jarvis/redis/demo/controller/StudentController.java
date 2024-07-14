package com.jarvis.redis.demo.controller;

import com.jarvis.redis.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public String addNewStudent(){
        return studentService.addNewStudent();
    }

    @GetMapping("/{id}")
    public String getStudent(@PathVariable Integer id){
        return studentService.fetchStudent(id).toString();
    }

    @GetMapping("/clearCache")
    public String clearAllStudentCache(){
        studentService.clearCache();
        return "cache cleared";
    }
}
