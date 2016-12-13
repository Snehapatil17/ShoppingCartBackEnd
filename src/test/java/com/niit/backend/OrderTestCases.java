/*package com.niit.backend;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Order;
import com.niit.shoppingcart.dao.OrderDAO;



public class OrderTestCases {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Order order;
	
	
	@Autowired
	static OrderDAO orderDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 orderDAO  = (OrderDAO) context.getBean("orderDAO");
		 
		 order  = (Order) context.getBean("order");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createOrderTestCase()
	{
		order.setId("1001");
		
		order.setBillingaddress("Pune");
		
		order.setShippingaddress("Dhanori");
		
		order.setPaymentmode("COD");
		
		Boolean status = orderDAO.save(order);
		
		Assert.assertEquals("createOrderTestcase", true, status);
	}
	
	

}
*/