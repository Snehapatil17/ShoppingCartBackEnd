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
			private String id;
		
		@Column(name="name")
			private String name;
		
		@Column(name="password")
			private String password;
			
		@Column(name="emailid")
			private String emailid;
		
		@Column(name="billingaddr")
			private String billingaddr;
		
		@Column(name="shippingaddr")
			private String shippingaddr;
		
		
		
public String getId()
	{
		return id;
	}

	public void setId(String id) 
	{
		
		this.id=id;
		
	}
	
//-------------------------------------------------
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
//-------------------------------------------		
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
//------------------------------------------------------
	
	public String getBillingaddr()
	{
		return billingaddr;
	}
	
	public void setBillingaddr(String billingaddr)
	{
		this.billingaddr=billingaddr;
	}
//-------------------------------------------------------
	
	public String getShippingaddr()
	{
		return shippingaddr;
	}
	
	public void setShippingaddr(String shippingaddr)
	{
		this.shippingaddr=shippingaddr;
	}
//--------------------------------------------------------------
	public String getEmailid()
	{
		return emailid;
	}
	
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	
	
	
		
}
