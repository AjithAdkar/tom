package com.ajith.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ajith.dao.StudentRepo;
import com.ajith.model.Student;

import jakarta.annotation.Resource;

@Service
public class StudentServiceimp implements StudentService {
	@Resource
	StudentRepo studentrepo;
	
	@Override
	public List<Student> findAllStudent() {
		return studentrepo.findAll();
	}

	@Override
	public Optional<Student> findStudent(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student editStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
