package com.niit.backend;

/*import static org.junit.Assert.*;*/

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.SupplierDAO;

import com.niit.shoppingcart.model.Supplier;




public class SupplierTestCases {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Supplier supplier;
	
	
	@Autowired
	static SupplierDAO  supplierDAO;
	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 supplierDAO  = (SupplierDAO) context.getBean("supplierDAO");
		 
		 supplier  = (Supplier) context.getBean("supplier");
		 
		 System.out.println("The object is created");
	 }
 
	@Test
	public void createSupplierTestCase()
	{
		supplier.setId("14");
		
		supplier.setName("Pratiksha");
		
		supplier.setAddress("Aurngabad");
		
		Boolean status = supplierDAO.save(supplier);
		
		Assert.assertEquals("createSupplierTestcase",true, status);
	}
	

	/*@Test
	public void deleteSupplierTestCase()
	{
		supplier.setId("11");
		boolean status = SupplierDAO.delete(supplier);
		
		Assert.assertEquals("delete supplier Test case",true, status);
	}*/







}





