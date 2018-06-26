package com.user.bootuser.service;

import java.util.List;

import com.user.bootuser.dto.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployee();

	Employee findByEmployeeId(String id);
}
