package com.example.eRegistrarWebAPI.controller;

import com.example.eRegistrarWebAPI.dto.StudentRequest;
import com.example.eRegistrarWebAPI.entity.Student;
import com.example.eRegistrarWebAPI.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/student")

@RequestMapping(value = "/api/student")

public class StudentController {

@Autowired
    private StudentServiceImp studentServiceImp;

// display list of student
    @GetMapping("/list")
    public List<Student> displayStudentList(){
        return studentServiceImp.getAllStudent();
    }
// display student by id

    @GetMapping("/{id}")
    public Student displayStudentById(@PathVariable("id") Long id){
            return studentServiceImp.getStudentById(id);

    }
    //update student by id

    @PutMapping("/update/{id}")
    public Student updateStudent(@RequestBody Student student){
        return studentServiceImp.updateStudent(student);
    }

    //delete student by id
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Long id){
        studentServiceImp.deleteStudentById(id);
    }


    //add student
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        //Student student1 = studentServiceImp.addStudent(student);
        return studentServiceImp.saveStudent(student);
    }



}
