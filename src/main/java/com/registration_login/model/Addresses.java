package com.registration_login.model;

import java.io.Serializable;

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
@Table(name = "G13_ADDRESSES")
public class Addresses implements Serializable {


	@Override
	public String toString() {
		return "Addresses [address_id=" + address_id + ", address_line_1=" + address_line_1 + ", address_line_2="
				+ address_line_2 + ", pin_code=" + pin_code + ", state=" + state + ", city=" + city + ", address_type="
				+ address_type + ", customer_id=" + customer_id + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Size(min=12, max=12)
	@Column (name="ADDRESS_ID")
	private int address_id;

	@NotNull
	@Column(name="ADDRESS_LINE_1")
	private String address_line_1;

	
	@Column(name="ADDRESS_LINE_2")
	private String address_line_2;

	@NotNull
	@Column(name="PIN_CODE")
	private String pin_code;
	
	@NotNull
	@Column(name="STATE")
	private String state;
	
	@Column(name="CITY")
	private String city;
	
	@NotNull
	@Column (name="ADDRESS_TYPE")
	private int address_type;
	
	@NotNull
	@Size(min=12, max=12)
	@Column(name="CUSTOMER_ID")
	private int customer_id;
	
/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID",unique=true)
	private Customers customers;*/
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID",unique=true, insertable = false, updatable = false)
	private Customers customers;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress_line_1() {
		return address_line_1;
	}

	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	public String getAddress_line_2() {
		return address_line_2;
	}

	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	public String getPin_code() {
		return pin_code;
	}

	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAddress_type() {
		return address_type;
	}

	public void setAddress_type(int address_type) {
		this.address_type = address_type;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	
	
	
	
	
	



}