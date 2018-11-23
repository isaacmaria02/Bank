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
@Table(name = "G13_INTERNET_BANKING_USERS")
public class InternetBankingUsers implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Size(min=12, max=12)
	@Column (name="USER_ID")
	private String user_id;

	@NotNull
	@Column(name="LOGIN_PASSWORD")
	private String login_password;

	
	@Column(name="TRANSACTION_PASSWORD")
	private String transaction_password;

	@NotNull
	@Column(name="ATTEMPTS")
	private int attempts;
	
	@NotNull
	@Column(name="STATUS")
	private String status;
	
	
	@NotNull
	@Column(name="SECURITY_QUESTIONS")
	private String security_questions;
	

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	@NotNull
	@Column(name="SECURITY_ANSWERS")
	private String security_answers;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER",unique=true)
	private Accounts accounts;

/*	@NotNull
	@Column(name="ACCOUNT_NUMBER")
	private int account_number;*/
	
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public String getTransaction_password() {
		return transaction_password;
	}

	public void setTransaction_password(String transaction_password) {
		this.transaction_password = transaction_password;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSecurity_questions() {
		return security_questions;
	}

	public void setSecurity_questions(String security_questions) {
		this.security_questions = security_questions;
	}

	public String getSecurity_answers() {
		return security_answers;
	}

	public void setSecurity_answers(String security_answers) {
		this.security_answers = security_answers;
	}


	

	
	
	



}