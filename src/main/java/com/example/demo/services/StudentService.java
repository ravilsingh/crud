package com.example.demo.services;

import com.example.demo.entity.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{
    @Autowired
    StudentRepo studentRepository;

    public Student createStudent( Student student)
    {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id)
    {
        return studentRepository.findById(id);
    }

    public Student updateStudent(Long id, Student updateStudent)
    {
        Student student= studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student Not Found"));
        student.setAddress(updateStudent.getAddress());
        student.setEmail(updateStudent.getEmail());
        student.setName(updateStudent.getName());
        return studentRepository.save(student);

    }

    public void  deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }

}
