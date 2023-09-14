package com.neeraj.service;

import com.neeraj.repositories.EmployeeRepository;
import com.neeraj.entities.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	public List<Employee> getAllEmployees () {
		return employeeRepository.findAll();
	}
	
	@Override
	public void remove_employee(Employee to_be_deleted) {
		employeeRepository.delete(to_be_deleted);
	}

}
