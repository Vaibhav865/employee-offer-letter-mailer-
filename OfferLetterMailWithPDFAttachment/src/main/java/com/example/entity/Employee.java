package com.example.entity;



public class Employee {
		
	private String employeeName;
	private String employeeEmail;
	private String designation;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee(String employeeName, String employeeEmail, String designation) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.designation = designation;
	}
	
	
		
	
}
