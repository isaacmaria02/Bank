package com.registration_login.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "G13_PAYEE")
public class Payee implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Size(min=12, max=12)
	@Column (name="PAYEE_ACCOUNT_NUMBER")
	private int payee_account_number;

	@NotNull
	@Column(name="NAME")
	private String name;

	
	@Column(name="NICK_NAME")
	private String nick_name;

/*	@NotNull
	@Column(name="CUSTOMER_ACCOUNT_NUMBER")
	private int customer_account_number;*/
	
/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER",unique=true)
	private Accounts accounts;*/


	public int getPayee_account_number() {
		return payee_account_number;
	}

	public void setPayee_account_number(int payee_account_number) {
		this.payee_account_number = payee_account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}


	
	
	
	



}