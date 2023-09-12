package org.priyanka.service;

import java.util.List;


import org.priyanka.entities.Employee_details;
import org.priyanka.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee_details addEmployee(Employee_details employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee_details> getAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
