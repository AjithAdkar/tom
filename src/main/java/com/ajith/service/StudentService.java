package com.ajith.service;

import java.util.List;
import java.util.Optional;

import com.ajith.model.Student;

public interface StudentService {

	List<Student> findAllStudent();

	Optional<Student> findStudent(int id);

	Student createStudent(Student student);

	Student editStudent(Student student);

	boolean deleteStudent(int id);

}
