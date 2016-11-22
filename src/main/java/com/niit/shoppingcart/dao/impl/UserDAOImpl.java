package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;


	
	@Repository("userDAO")

	public class UserDAOImpl implements UserDAO{
		
		@Autowired
		SessionFactory sessionFactory;
		
		public UserDAOImpl(SessionFactory sessionFactory)
		{
			
				this.sessionFactory=sessionFactory;
			
		}

		@Transactional
		public boolean save(User user) {
			
		try{
			/*
			if(get(user.getId())!=null)
			{
				return false;
			}*/
			
			sessionFactory.getCurrentSession().save(user);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
			
		}
		
		
	}
		
		
		@Transactional
		
		public boolean update(User user) {
			
			try{
				/*if(get(user.getId())!=null)
				{
					return false;
				}
				*/
				sessionFactory.openSession().update(user);
				
				return true;
				
			}
			
			catch (Exception e){
				
				e.printStackTrace();
				
				return false;
				
			}
			
			
		}
		
		@Transactional

		public User get(String id) {
			
			return(User) sessionFactory.openSession().get(User.class,id);
		}
		
		
		@Transactional
		public boolean delete(User user) {
			
			try{
				/*if(get(user.getId())!=null)
				{
					return false;
				}*/
				
				sessionFactory.openSession().delete(user);
				
				return true;
				
			}
			
			catch (Exception e){
				
				e.printStackTrace();
				
				return false;
				
			}
			
		}

		public List<User> list() {
			return null;
			
			/*String hql="from user";
			
			Query query=sessionFactory.getCurrentSession().createQuery(hql);
			
			return query.list();*/
			
			
		}
	
	
	
	

}
