package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


	
	@Entity
	@Table(name="user")
	@Component
	public class User {
		
		@Id
		@Column(name="Id")
			private String id;
		
		@Column(name="name")
			private String name;
		
		@Column(name="password")
			private String password;
		
		@Column(name="cpassword")
		private String cpassword;
			
		@Column(name="emailid")
			private String emailid;
		
		
		
		
public String getId()
	{
		return id;
	}

	public void setId(String id) 
	{
		
		this.id=id;
		
	}
	
//-------------------------------------------------
	
	public String getCpassword() {
		return cpassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	
	
	
		
}
