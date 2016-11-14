package com.niit.backend;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTestCases {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Product product;
	
	
	@Autowired
	static ProductDAO productDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 productDAO  = (ProductDAO) context.getBean("productDAO");
		 
		 product  = (Product) context.getBean("product");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createProductTestCase()
	{
		product.setId("21");
		
		product.setName("Lehega");
		
		product.setPrice("6000");
		
		Boolean status = productDAO.save(product);
		
		Assert.assertEquals("createProductTestcase", true, status);
	}
	
	

}
