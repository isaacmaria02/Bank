package com.registration_login.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.registration_login.model.Customers;


@Repository
public class CustomersDAOImpl implements CustomersDAO {

	@Autowired
	private SessionFactory sessionFactory;


	public void addCustomers(Customers customers) {
		sessionFactory.getCurrentSession().saveOrUpdate(customers);
	}

}
