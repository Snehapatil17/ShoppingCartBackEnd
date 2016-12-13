package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity
@Component
public class ShippingAddress implements Serializable {
	private static final long serialVersionUID= 1L;
	 
	@Id
	private String shippingAddressId;
	
	@NotBlank(message="Specify main address")
	private String line1;
	private String line2;
	
	@NotBlank(message="Specify city")
	private String city;
	
	@NotBlank(message="Specify state")
	private String state;
	
	@NotBlank(message="Specify contry")
	private String contry;
	
	@NotBlank(message="Specify zipcode")
	private String zipcode;
	
	public String getShippingAddressId()
	{
		return shippingAddressId;
	}
	
	public void setShippingAddressId(String shippingAddressId)
	{
		this.shippingAddressId = shippingAddressId;
	}
	
	public String getCutomerId()
	{
		return getCutomerId();
	}

}
