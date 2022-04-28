package com.lab.restapi.service;

import com.lab.restapi.entity.Course;
import com.lab.restapi.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    void save(Student student);

    List<Student> getAll();

    Student getById(long id);

    void delete(long id);

}
