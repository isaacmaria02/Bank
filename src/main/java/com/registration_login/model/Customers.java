package com.registration_login.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "G13_CUSTOMERS")
public class Customers implements Serializable {




	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Size(min=12, max=12)
	@Column (name="CUSTOMER_ID")
	private int customer_id;

	@NotNull
	@Column(name="FIRST_NAME")
	private String first_name;

	
	@Column(name="MIDDLE_NAME")
	private String middle_name;

	@NotNull
	@Column(name="LAST_NAME")
	private String last_name;
	
	@NotNull
	@Column(name="FATHER_NAME")
	private String father_name;
	
	@Column(name="EMAIL_ID")
	private String email_id;
	
	@NotNull

	@Column (name="MOBILE_NUMBER")
	private int mobile_number;
	
	@NotNull	
	@Column(name="AADHAR_CARD")
	private int aadhar_card;
	
	@NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name="DATE_OF_BIRTH")
	@Type(type="date")
	private String date_of_birth;
	
	@Column(name="ANNUAL_INCOME")
	private int annual_income;
	
/*	@NotNull
	@Length(min=12, max=12)
	@Column (name="ACCOUNT_NUMBER")
	private int account_number;*/
	
	

/*	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID")
	private Addresses addresses;*/
	
	
/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID",unique=true)
	private Accounts accounts;*/

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public int getAadhar_card() {
		return aadhar_card;
	}

	public void setAadhar_card(int aadhar_card) {
		this.aadhar_card = aadhar_card;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(int annual_income) {
		this.annual_income = annual_income;
	}

	@Override
	public String toString() {
		return "Customers [customer_id=" + customer_id + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", father_name=" + father_name + ", email_id=" + email_id
				+ ", mobile_number=" + mobile_number + ", aadhar_card=" + aadhar_card + ", date_of_birth="
				+ date_of_birth + ", annual_income=" + annual_income + "]";
	}

	
	


	
	

	



	
	
	
	
	



}