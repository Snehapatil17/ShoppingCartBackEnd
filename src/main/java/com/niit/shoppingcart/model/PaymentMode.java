package com.niit.shoppingcart.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class PaymentMode  implements Serializable{
	
	private String paymentMode;
	
	public String getPaymentMode()
	{
		return paymentMode;
	}
	 public void setPaymentMode(String paymentMode){
		 this.paymentMode = paymentMode;
	 }

}
