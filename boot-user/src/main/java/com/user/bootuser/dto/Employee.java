package com.user.bootuser.dto;

public class Employee {

	private String empId;
	private String empName;
	private String empCompany;
	private String empDepartment;

	public Employee(String empId, String empName, String empCompany, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCompany = empCompany;
		this.empDepartment = empDepartment;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCompany() {
		return empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

}
