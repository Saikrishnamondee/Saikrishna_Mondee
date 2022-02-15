package com.mondee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Email2")
public class Email {
	
	@Id
	@Column(name="mailid")
	private String mailid;
	@OneToOne(targetEntity=Employeee.class)  
	
	private Employeee employee;  
	
	public String getMailid() {
		return mailid;
	}

	public Employeee getEmployee() {
		return employee;
	}

	public void setEmployee(Employeee employee) {
		this.employee = employee;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	
	

}
