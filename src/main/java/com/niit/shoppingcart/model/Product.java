package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



	
	@Entity
	@Table(name="Product")
	@Component


	public class Product {

		@Id
			
			private String id;
			
		@Column(name="name")
			private String name;
			
			private String price;
		
			public String getId()
			{
				return id;
			}
			
			public void setId(String id)
			{
				
				this.id=id;
			}

			public String getName()
			{
				return name;
			}
			
			public void setName(String name)
			{
				this.name=name;
			}
			
			public void setPrice(String price)
			{
				this.price=price;
			}
			
			public String getPrice()
			{
				return price;
			}
			
			
	}	

