package com.example.eRegistrarWebAPI.entity;

import ch.qos.logback.classic.spi.LoggingEventVO;
import com.example.eRegistrarWebAPI.dto.StudentRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name="students")
@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor()
@JsonIgnoreProperties({"hibernateLazyInitializer"})

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;

    @NotNull(message = "Student Number is required")
    private String studentNumber;

    private String firstName;
    private String middleName;

    @NotNull(message = "Last Name is required")
    private String lastName;
    private double cgpa;

    @NotNull(message = "Enrollment Date is required")
    private LocalDate enrollmentDate;

    private boolean isInternational;

    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate enrollmentDate, boolean isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

//    public static Student build(StudentRequest studentRequest) {
//        Student student = new Student();
//        student.setStudentNumber(studentRequest.getStudentNumber());
//        student.setFirstName(studentRequest.getFirstName());
//        student.setMiddleName(studentRequest.getMiddleName());
//        student.setLastName(studentRequest.getLastName());
//        student.setCgpa(Double.parseDouble(studentRequest.getCgpa()));
//        student.setEnrollmentDate(LocalDate.parse(studentRequest.getEnrollmentDate()));
//        student.setInternational(studentRequest.isInternational());
//
//        return student;
//    }

}
