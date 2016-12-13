/*package com.niit.shoppingcart.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="order1")
@Component

public class Order {
	
	
	
		
		@Id
		private String id;
		
		@Column(name="billingaddress")
		private String billingaddress;
		
		@Column(name="shippingaddress")
		private String shippingaddress;
		
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
		public String getBillingaddress()
		{
			return billingaddress;
		}
		
		public void setBillingaddress(String billingaddress)
		{
			
			this.billingaddress=billingaddress;
		}
	//--------------------------------------------
		public String getShippingaddress()
		{
			return shippingaddress;
		}
		
		public void setShippingaddress(String shippingaddress)
		{
			this.shippingaddress=shippingaddress;
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
*/