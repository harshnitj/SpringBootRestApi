package com.employee.rest.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.employee.rest.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Employee findByEmpcity(String emp_city);

	Optional<List<Employee>> findByEmpageGreaterThan(int emp_age);

}
