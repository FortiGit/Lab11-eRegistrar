package com.example.eRegistrarWebAPI.service;

import com.example.eRegistrarWebAPI.dto.StudentRequest;
import com.example.eRegistrarWebAPI.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();
    Student saveStudent(Student student);
   // Student addStudent(StudentRequest studentRequest);
    Student getStudentById(Long studentId);
    Student updateStudent(Student student);
    void deleteStudentById(Long studentId);
}


