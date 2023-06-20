package com.example.eRegistrarWebAPI.dto;

import com.example.eRegistrarWebAPI.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(staticName = "build")
@Setter
@Getter
public class StudentRequest {
    private String firstName;
    private String middleName;
    private String lastName;
    private String studentNumber;
    private String cgpa;
    private String enrollmentDate;
    private boolean isInternational;

    public StudentRequest() {

    }

    public StudentRequest(Student student) {

        this.firstName = student.getFirstName();
        this.middleName = student.getMiddleName();
        this.lastName = student.getLastName();
        this.studentNumber = student.getStudentNumber();
        this.cgpa = String.valueOf(student.getCgpa());
        this.enrollmentDate = String.valueOf(student.getEnrollmentDate());
        this.isInternational = student.isInternational();
    }

    public StudentRequest getAllStudent() {
        return this;
    }
}
