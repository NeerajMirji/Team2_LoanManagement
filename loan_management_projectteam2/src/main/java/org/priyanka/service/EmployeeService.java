package org.priyanka.service;

import java.util.List;


import org.priyanka.entities.Employee_details;

public interface EmployeeService {

	Employee_details addEmployee(Employee_details employee);
	List<Employee_details> getAll();
}
