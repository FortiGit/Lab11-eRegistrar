package com.example.eRegistrarWebAPI.repository;

import com.example.eRegistrarWebAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
