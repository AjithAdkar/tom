package com.ajith.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajith.model.Student;
import com.ajith.response.Studentresponse;

@RestController
@RequestMapping("/student")
public class StudentControl {
	@Autowired
	Student student;

	@GetMapping("/showall")
	private ResponseEntity<Object> showall() {
		return new Studentresponse().getResponse(student, "updated", HttpStatus.OK);
	}
	@PutMapping("/addstudent")
	private ResponseEntity<Object> add(@RequestBody Student s){
		return null;
		
	}

}
