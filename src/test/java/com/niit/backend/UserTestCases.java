package com.niit.backend;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTestCases {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static User user;
	
	
	@Autowired
	static UserDAO userDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 userDAO  = (UserDAO) context.getBean("userDAO");
		 
		 user  = (User) context.getBean("user");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createUserTestCase()
	{
		user.setId("102");
		
		user.setName("Pratiksha");
		
		user.setPassword("Pratiksha");
		
		user.setEmailid("patilpratiksha1412@gmail.com");
		
		user.setBillingaddr("Pune");
		
		user.setShippingaddr("Chinchawad");
		
		Boolean status = userDAO.save(user);
		
		Assert.assertEquals("createUserTestcase", true, status);
	}
	
	
	
	

	/*@Test
	public void deleteUserTestCase()
	{
		user.setId("4");
		boolean status = userDAO.delete(user);
		
		Assert.assertEquals("delete User Test case",true, status);
	}
*/


		
	

}
