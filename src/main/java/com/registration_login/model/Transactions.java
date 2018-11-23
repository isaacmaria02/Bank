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
@Table(name = "G13_TRANSACTIONS")
public class Transactions implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Size(min=12, max=12)
	@Column (name="REFERENCE_ID")
	private int reference_id;

	@NotNull
	@Column(name="TYPE")
	private String type;

	
	@Column(name="AMOUNT")
	private int amount;

	/*@NotNull
	@Column(name="FROM_ACCOUNT")
	private int from_account;*/
	
	@NotNull
	@Column(name="TO_ACCOUNT")
	private int to_account;
	
	@Column(name="TIMESTAMP")
	private String timestamp;
	
	@Column (name="REMARK")
	private String remark;
	

/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER",unique=true)
	private Accounts accounts;*/

	public int getReference_id() {
		return reference_id;
	}

	public void setReference_id(int reference_id) {
		this.reference_id = reference_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTo_account() {
		return to_account;
	}

	public void setTo_account(int to_account) {
		this.to_account = to_account;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	

	
	



}