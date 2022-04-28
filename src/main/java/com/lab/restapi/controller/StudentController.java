package com.lab.restapi.controller;

import com.lab.restapi.entity.Course;
import com.lab.restapi.entity.Student;
import com.lab.restapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable long id) {
        return studentService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id) {
        studentService.delete(id);
    }

    @PostMapping("/add/{id}")
    public void saveCourse(@RequestBody Course course) {

    }
}
