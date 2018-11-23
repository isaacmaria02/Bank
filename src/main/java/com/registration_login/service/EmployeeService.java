package com.registration_login.service;

import java.util.List;

import com.registration_login.model.Customers;

public interface EmployeeService {
	
	public void addEmployee(Customers employee);

	public List<Customers> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Customers getEmployee(int employeeid);

	public Customers updateEmployee(Customers employee);
}
