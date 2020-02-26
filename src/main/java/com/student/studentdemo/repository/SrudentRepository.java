package com.student.studentdemo.repository;

import com.student.studentdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SrudentRepository extends JpaRepository<Student, Long> {
}
