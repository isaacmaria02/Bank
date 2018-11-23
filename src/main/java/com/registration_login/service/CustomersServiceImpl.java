package com.registration_login.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registration_login.dao.CustomersDAO;
import com.registration_login.model.Customers;


@Service
@Transactional
public class CustomersServiceImpl implements CustomersServices {

	@Autowired
	private CustomersDAO usersDAO;
	
	@Transactional
	public void addCustomers(Customers customers) {
		// TODO Auto-generated method stub
		
	}

}
