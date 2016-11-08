package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="category")
@Component

public class Category {
	
	@Id
	
	private String cid;
	
	private String name;
	
	public String getId()
	{
		return cid;
	}
	
	public void setId(String id)
	{
		
		this.cid=cid;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	
	
}
