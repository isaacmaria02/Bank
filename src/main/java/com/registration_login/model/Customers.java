package com.registration_login.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "G13_CUSTOMERS")
public class Customers implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (length = 12)
	private int CUSTOMER_ID;

	@Column
	private String FIRST_NAME;

	@Column
	private String MIDDLE_NAME;

	@Column
	private String LAST_NAME;
	
	@Column
	private String FATHER_NAME;
	
	@Column
	private String EMAIL_ID;
	
	@Column (length = 10)
	private int MOBILE_NUMBER;
	
	@Column(length = 16)
	private int AADHAR_CARD;
	
	@Column
	private String DATE_OF_BIRTH;
	
	@Column
	private int ANNUAL_INCOME;
	
	@Column (length = 12)
	private int ACCOUNT_NUMBER;

	
	
	



}