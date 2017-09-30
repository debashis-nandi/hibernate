package com.global.hb;

import java.time.LocalDate;
import java.util.Date;

public class Customer {
	
	private int customerId;
	private String custName;
	private String custEmail;
	private String custPhone;
	private LocalDate custDOB;
	
	

	public Customer(int customerId, String custName, String custEmail, String custPhone, LocalDate custDOB) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPhone = custPhone;
		this.custDOB = custDOB;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custName=" + custName + ", custEmail=" + custEmail
				+ ", custPhone=" + custPhone + ", custDOB=" + custDOB + "]";
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}


	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public LocalDate getCustDOB() {
		return custDOB;
	}
	public void setCustDOB(LocalDate custDOB) {
		this.custDOB = custDOB;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	

}
