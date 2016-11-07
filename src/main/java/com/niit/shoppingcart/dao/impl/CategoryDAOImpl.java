package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO{

	public boolean save(Category category) {
		
		return false;
	}

	public boolean update(Category category) {
		
		return false;
	}

	public Category get(String id) {
		
		return null;
	}

	public boolean delete(Category category) {
		
		return false;
	}

	public List<Category> list() {
		
		return null;
	}

}
