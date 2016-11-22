package com.niit.backend;

/*import static org.junit.Assert.*;*/


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;




public class CategoryTestCases {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Category category;
	
	
	@Autowired
	static CategoryDAO categoryDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 categoryDAO  = (CategoryDAO) context.getBean("categoryDAO");
		 
		 category  = (Category) context.getBean("category");
		 
		 System.out.println("The object is created");
	 }
 
	@Test
	public void createCategoryTestCase()
	{
		category.setId("5");
		
		category.setName("Plazo");
		
		Boolean status = categoryDAO.save(category);
		
		Assert.assertEquals("createCategoryTestcase", true, status);
	}
	
	
	
	

	/*@Test
	public void deleteCategoryTestCase()
	{
		category.setId("4");
		boolean status = categoryDAO.delete(category);
		
		Assert.assertEquals("delete Category Test case",true, status);
	}
*/






}





