package com.jarvis.redis.demo.service;

import com.jarvis.redis.demo.model.Student;
import com.jarvis.redis.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addNewStudent(){
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("John");
        student1.setCountry("India");


        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Cena");
        student2.setCountry("India");

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Rock");
        student3.setCountry("India");


        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        String resp = "Three students added";
        System.out.println(resp);
        return resp;
    }

    @Cacheable(cacheNames = "student", key = "#id")
    public Student fetchStudent(int id){
        System.out.println("Fetching from DB");
        Optional<Student> studentOpt = studentRepository.findById(id);
        return studentOpt.orElse(null);
    }

    @CacheEvict(value = "student", allEntries = true)
    public void clearCache(){
    }
}
