package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDAO {
	
	//CRUD Operations
	
		public boolean save(Product product);
		
		public boolean update(Product product);
		
		public Product get(String id);
		
		public boolean delete(Product product);
		
		
		public List<Product> list();

	

}
