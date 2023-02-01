package com.ajith.response;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajith.model.Student;
@Component
@ResponseBody
public class Studentresponse {
	public ResponseEntity<Object> getResponse(Student student, String message, HttpStatus httpStatus) {
		HashMap<String, Object> response = new HashMap<>();
		response.put("message", message);
		response.put("object", student);
		return new ResponseEntity<>(response, httpStatus);
	}

}
