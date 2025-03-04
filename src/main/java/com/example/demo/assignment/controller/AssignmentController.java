package com.example.demo.assignment.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {
//	http://localhost:8083/swagger-ui/index.html
	@GetMapping("/")
	public String currentDateandTime() {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return time.format(formatter);
	}
	
	@PostMapping("/employee")
	public String createEmployee() {
		return "Employee created";
	}

}
