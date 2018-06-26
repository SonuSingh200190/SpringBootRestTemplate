package com.user.bootuser.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.bootuser.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> employeeList = new ArrayList<Employee>(
			Arrays.asList(new Employee("1", "Sonu Kumar Singh", "Virtusa", "SCB"),
					new Employee("2", "Satyadeep Parida", "Virtusa", "SCB"),
					new Employee("3", "Purushottaman", "HCL", "SCB")));

	@Override
	public List<Employee> findAllEmployee() {

		return employeeList;
	}

	@Override
	public Employee findByEmployeeId(String id) {

		return employeeList.stream().filter(t -> t.getEmpId().equals(id)).findFirst().get();
	}

}
