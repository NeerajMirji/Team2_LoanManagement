package org.priyanka.repositories;

import org.priyanka.entities.Employee_details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee_details, Integer> {

}
