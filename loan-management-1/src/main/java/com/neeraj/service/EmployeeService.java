package com.neeraj.service;

import java.util.List;

import com.neeraj.entities.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
	public void remove_employee(Employee employee);
}
