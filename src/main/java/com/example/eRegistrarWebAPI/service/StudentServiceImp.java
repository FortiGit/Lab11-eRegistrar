package com.example.eRegistrarWebAPI.service;

import com.example.eRegistrarWebAPI.dto.StudentRequest;
import com.example.eRegistrarWebAPI.entity.Student;
import com.example.eRegistrarWebAPI.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    private StudentRepository studentRepository;

    private StudentServiceImp(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        Student student1 = studentRepository.findById(student.getStudentId()).orElse(null);
        student.setStudentId(student.getStudentId());
        student1.setFirstName(student.getFirstName());
        student1.setMiddleName(student.getMiddleName());
        student1.setLastName(student.getLastName());
        student1.setEnrollmentDate(student.getEnrollmentDate());
        student1.setCgpa(student.getCgpa());

        return studentRepository.save(student1);
    }
//    @Override
//    public Student addStudent(StudentRequest studentRequest) {
//        var student = Student.build(studentRequest.getAllStudent());
//
//        return student;
//    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);

    }
}
