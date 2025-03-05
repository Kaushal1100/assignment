package com.example.demo.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.assignment.entity.Employee;

@Service
public class EmployeeService {
	
	public List<Employee> getEmployees(){
		List<Employee> employees= new ArrayList<>();
		employees.add(new Employee(1L,"Eric","Cantona","ecan@gmail.com"));
		employees.add(new Employee(2L,"Wayne","Rooney","wroon@gmail.com"));
		employees.add(new Employee(3L,"Paul","Scholes","pschol@gmail.com"));
		employees.add(new Employee(4L,"Bruno","Fernandes","bfern@gmail.com"));
		
		return employees;
	}

}
