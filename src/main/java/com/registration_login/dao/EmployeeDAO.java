package com.registration_login.dao;

import java.util.List;

import com.registration_login.model.Customers;

public interface EmployeeDAO {

	public void addEmployee(Customers employee);

	public List<Customers> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Customers updateEmployee(Customers employee);

	public Customers getEmployee(int employeeid);
}
