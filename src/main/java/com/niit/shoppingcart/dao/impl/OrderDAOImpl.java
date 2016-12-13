/*package com.niit.shoppingcart.dao.impl;

import java.awt.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.model.Order;

public class OrderDAOImpl {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public OrderDAOImpl(SessionFactory sessionFactory)
	{
		
			this.sessionFactory=sessionFactory;
		
	}

	@Transactional
	public boolean save(Order order) {
		
	try{
		
		if(get(order.getId())!=null)
		{
			return false;
		}
		
		sessionFactory.getCurrentSession().save(order);
		
		return true;
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
		
		return false;
		
		
	}
	
	
}
	
	
	@Transactional
	
	public boolean update(Order order) {
		
		try{
			if(get(order.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().update(order);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
	}
	
	@Transactional

	public Order get(String id) {
		
		return(Order) sessionFactory.openSession().get(Order.class,id);
	}
	
	
	@Transactional
	public boolean delete(Order order) {
		
		try{
			if(get(order.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().delete(order);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

	public List list() {
		
		return null;
		
		String hql="from order";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
		
	}

}
*/