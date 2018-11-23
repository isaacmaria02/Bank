package com.registration_login.model;

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
@Entity
@Table(name = "G13_ACCOUNTS")
public class Accounts {
	@Override
	public String toString() {
		return "Accounts [acc_no=" + acc_no + ", balance=" + balance + ", account_type=" + account_type
				+ ", transactions=" + transactions + ", payee=" + payee + ", customers=" + customers + "]";
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ACCOUNT_NUMBER")
	private int  acc_no;
	
	
	@Column(name="BALANCE")
	private int balance;
	

	@Column(name="ACCOUNT_TYPE")
	private String account_type;
	
	

/*	@Column(name="CUSTOMER_ID")
	private int customer_id;*/


	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER")
	private List<Transactions> transactions;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER")
	private List<Payee> payee;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER",unique=true)
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER")
	private InternetBankingUsers internetBankingUsers;*/
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID",unique=true, insertable = false, updatable = false)
	private Customers customers;

	public List<Transactions> getTransactions() {
		return transactions;
	}



	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}



	public List<Payee> getPayee() {
		return payee;
	}



	public void setPayee(List<Payee> payee) {
		this.payee = payee;
	}



	public Customers getCustomers() {
		return customers;
	}



	public void setCustomers(Customers customers) {
		this.customers = customers;
	}



	public int getAcc_no() {
		return acc_no;
	}



	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public String getAccount_type() {
		return account_type;
	}



	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}




	
	
}
