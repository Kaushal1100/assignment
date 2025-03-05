package com.example.demo.assignment.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.assignment.entity.Employee;
import com.example.demo.assignment.service.EmployeeService;

@RestController
public class AssignmentController {
//	http://localhost:8083/swagger-ui/index.html
//	http://ec2-54-166-208-60.compute-1.amazonaws.com:8083/swagger-ui/index.html

	@Autowired
	private EmployeeService employeeService; 
	@GetMapping("/time")
	public String currentDateandTime() {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return time.format(formatter);
	}
	
	@PostMapping("/employee")
	public String createEmployee() {
		return "Employee created";
	}

	@PutMapping("/employee")
	public String updateEmployee() {
		return "Employee updated";
	}
	
	@DeleteMapping("/employee")
	public String deleteEmployee() {
		return "Employee deleted";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
}
