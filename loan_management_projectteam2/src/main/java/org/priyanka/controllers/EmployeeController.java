package org.priyanka.controllers;

import java.util.List;


import org.priyanka.entities.Employee_details;
import org.priyanka.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Employee_details> addEmployee(@Valid  @RequestBody Employee_details employee){
		
		Employee_details emp=employeeService.addEmployee(employee);
		
		
		return new ResponseEntity<Employee_details>(emp,HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Employee_details> getAllEmployees(){
		return employeeService.getAll();
	}

}
