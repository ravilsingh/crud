package com.example.demo.controllers;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController
{

    @Autowired
    StudentService studentService;

    @PostMapping("/inserted")
    public Student createStudent(@RequestBody Student student)
    {
        return studentService.createStudent(student);
    }

    
    @GetMapping("/getAllStudentsInformation")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudent();
    }

    @GetMapping("/getData/{id}")
    public Optional<Student> getStudentsById(@PathVariable Long id, @RequestParam String source)
    {
        return studentService.getStudentById(id);
    }

    @PutMapping("/updated/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student updateStudentBody)
    {
        return studentService.updateStudent(id, updateStudentBody);
    }


    @DeleteMapping("/removed/{id}")
    public String deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
        return "Student Deleted Successfully";
    }

}
