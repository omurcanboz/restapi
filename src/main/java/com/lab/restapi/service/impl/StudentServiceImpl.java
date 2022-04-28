package com.lab.restapi.service.impl;

import com.lab.restapi.entity.Course;
import com.lab.restapi.entity.Student;
import com.lab.restapi.repository.StudentRepository;
import com.lab.restapi.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public Student getById(long id) {
        return studentRepository.getById(id);
    }

    @Override
    public void delete(long id) {
        studentRepository.delete(id);
    }

}
