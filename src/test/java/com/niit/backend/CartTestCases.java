package com.niit.backend;

import org.junit.Assert;
import org.junit.BeforeClass;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;

public class CartTestCases {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Cart cart;
	
	
	@Autowired
	static CartDAO cartDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 cartDAO  = (CartDAO) context.getBean("cartDAO");
		 
		 cart  = (Cart) context.getBean("cart");
		 
		 System.out.println("The object is created");
	 }
 
	@Test
	public void createCartTestCase()
	{
		cart.setId("111");
		
		cart.setBillingaddr("Pune");
		
		cart.setShippingaddr("Dhanori");
		
		cart.setPaymentmode("COD");
		
		Boolean status = cartDAO.save(cart);
		
		Assert.assertEquals("createCartTestcase", true, status);
	}
	
	
	
	






}



