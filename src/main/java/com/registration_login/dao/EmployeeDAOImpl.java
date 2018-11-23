package com.registration_login.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.registration_login.model.Customers;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Customers employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	@SuppressWarnings("unchecked")
	public List<Customers> getAllEmployees() {

		return sessionFactory.getCurrentSession().createQuery("from Customers")
				.list();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		Customers employee = (Customers) sessionFactory.getCurrentSession().load(
				Customers.class, employeeId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}

	}

	public Customers getEmployee(int empid) {
		return (Customers) sessionFactory.getCurrentSession().get(
				Customers.class, empid);
	}

	@Override
	public Customers updateEmployee(Customers employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

}