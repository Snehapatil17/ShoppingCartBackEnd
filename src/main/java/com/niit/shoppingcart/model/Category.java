
package com.niit.shoppingcart.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "category")
@Component
public class Category {

	@Id
	private String id;

	@Column(name = "name")
	private String name;

	/*
	 * private Set<Product> products;
	 * 
	 * @OneToMany(mappedBy="category",fetch = FetchType.EAGER ) public
	 * Set<Product> getProducts(){
	 * 
	 * return products; }
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
