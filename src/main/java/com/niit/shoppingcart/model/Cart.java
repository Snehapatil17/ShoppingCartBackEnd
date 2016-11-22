package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="cart")
@Component
public class Cart {
	
	@Id
	private String id;
	
	@Column(name="billingaddr")
	private String billingaddr;
	
	@Column(name="shippingaddr")
	private String shippingaddr;
	
	@Column(name="paymentmode")
	private String paymentmode;
	
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
//----------------------------------------	
	public String getBillingaddr()
	{
		return billingaddr;
	}
	
	public void setBillingaddr(String billingaddr)
	{
		
		this.billingaddr=billingaddr;
	}
//--------------------------------------------
	public String getShippingaddr()
	{
		return shippingaddr;
	}
	
	public void setShippingaddr(String shippingaddr)
	{
		this.shippingaddr=shippingaddr;
	}
	
//---------------------------------------------------	
	public String getPaymentmode()
	{
		return paymentmode;
	}
	
	public void setPaymentmode(String paymentmode)
	{
		this.paymentmode=paymentmode;
	}
	
	
}
