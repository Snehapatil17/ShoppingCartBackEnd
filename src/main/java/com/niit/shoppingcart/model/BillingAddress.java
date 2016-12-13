package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity
@Component
public class BillingAddress implements Serializable{
	private static final long serialVersionUID= 1L;
	 
	@Id
	private String billingAddressId;
	
	@NotBlank(message="Specify main address")
	private String line1;
	@NotBlank
	private String line2;
	
	@NotBlank(message="Specify city")
	private String city;
	
	@NotBlank(message="Specify state")
	private String state;
	
	@NotBlank(message="Specify contry")
	private String country;
	
	@NotBlank(message="Specify zipcode")
	private String zipcode;

	
	
	public String getBillingAddressId()
	{
		return billingAddressId;
	}
	
	public void setBillingAddressId(String billingAddressId)
	{
		this.billingAddressId = billingAddressId;
	}
	
	public String getCutomerId()
	{
		return getCutomerId();
	}
	
	public String getLine1(String line1)
	{
		return line1;
	}
	
	public void setLine1(String line1)
	{
		this.line1 = line1;
	}
//---------------------------------------------
	public String getLine2(String line2)
	{
		return line2;
	}
	
	public void setLine2(String line2)
	{
		this.line2 = line2;
	}

	//--------------------------
	public String getCity(String city)
	{
		return city;
	}
	
	public void setcity(String city)
	{
		this.city = city;
	}
//---------------------------------------
	public String getCountry(String country)
	{
		return country;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
//----------------------------------------------
	public String getZipcode(String zipcode)
	{
		return zipcode;
	}
	
	public void setzipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}

	
}
