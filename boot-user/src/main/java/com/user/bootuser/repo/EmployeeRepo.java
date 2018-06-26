package com.user.bootuser.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.bootuser.dto.Employee;
import com.user.bootuser.service.EmployeeService;

@RestController
public class EmployeeRepo {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/employee/all")
	List<Employee> findAllCompany() {

		return employeeService.findAllEmployee();
	}

	@RequestMapping("/employee/{employeeId}")
	Employee findbyCompanyId(@PathVariable String employeeId) {
		return employeeService.findByEmployeeId(employeeId);
	}
}
