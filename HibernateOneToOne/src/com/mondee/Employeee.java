package com.mondee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employe2")
public class Employeee {
	
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="ename")
	private String ename;
	 
	@OneToOne(targetEntity=Email.class,cascade=CascadeType.ALL)  
	private Email email;
	
	public Email getEmail() {
		return email;
	}


	public void setEmail(Email email) {
		this.email = email;
	}


	public int getEid() {
		return eid;
	}
	
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

}
