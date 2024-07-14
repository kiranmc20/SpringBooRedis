package com.jarvis.redis.demo.repository;

import com.jarvis.redis.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {


}
