package com.ajith.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajith.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
