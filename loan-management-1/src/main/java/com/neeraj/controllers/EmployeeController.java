package com.neeraj.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
import com.neeraj.exception.ResourceNotFoundException;
import com.neeraj.entities.Employee;
import com.neeraj.service.EmployeeService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public String addEmployee(@Valid @RequestBody Employee employee) {
		
		
			try{
				Employee emp = employeeService.addEmployee(employee);
			}
			catch(ResourceNotFoundException e){
				System.out.print(e.getMessage());
				return e.getMessage();
			}
			return "Employee Added Successfully";
		}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int id) {

		try {
//			return ResponseEntity.ofNullable(employeeService.getEmployeeById(id)).orElseThrow(()-> new ResourceNotFoundException("transaction not found for this id :: " + id));
		Employee test  =  employeeService.getEmployeeById(id);
		
		return ResponseEntity.ok(test);

		}
		catch(ResourceNotFoundException e) {
		   
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> update_user(@PathVariable int id, @RequestBody Employee employee){
		Employee find_employee = employeeService.getEmployeeById(id);
		if(find_employee != null){
			System.out.print(find_employee);
		}
		find_employee.setName(employee.getName());
		find_employee.setGender(employee.getGender());
		find_employee.setAge(employee.getAge());
		find_employee.setSalary(employee.getSalary());
		find_employee.setEmail(employee.getEmail());
		find_employee.setDoj(employee.getDoj());
		find_employee.setMobile(employee.getMobile());
		
		Employee updated_employee = employeeService.addEmployee(find_employee);
//		Account updated_account = account_service_provider.getAccountByEmailId(find_user.getEmail()).orElseThrow(
//				()-> new ResourceNotFoundException("Product not found for this id :: " + id));
//		updated_account.setAccount_status(updated_user.getAccountStatus());
//	    Account updated_user_account = employeeService.save(updated_employee);
//		return ResponseEntity.ok(updated_user);
		return ResponseEntity.ok(updated_employee);
	}
	
	@DeleteMapping("/remove/{id}")
	public String delete_employee(@PathVariable int id){
		Employee find_employee = employeeService.getEmployeeById(id);
		employeeService.remove_employee(find_employee);
		return "Employee deleted";
	}
	

}
 