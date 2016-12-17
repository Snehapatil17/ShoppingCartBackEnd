package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

/*@EnableTransactionManagement*/
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	/*
	 * public CategoryDAOImpl() { // TODO Auto-generated constructor stub }
	 * 
	 * 
	 * //private static final Logger Logger =
	 * LoggerFactory.getLogger(CategoryDAOImpl.class);
	 */

	@Autowired
	SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Category category) {

		try {

			if (get(category.getId()) != null) {
				return false;
			}

			sessionFactory.getCurrentSession().save(category);

			return true;

		}

		catch (Exception e) {

			e.printStackTrace();

			return false;

		}

	}

	@Transactional
	public boolean update(Category category) {

		System.out.println("update");
		try {
			if (get(category.getId()) != null) {
				return false;
			}

			sessionFactory.openSession().update(category);
			sessionFactory.close();

			return true;

		}

		catch (Exception e) {

			e.printStackTrace();

			return false;

		}

	}

	@Transactional

	public Category get(String id) {

		return (Category) sessionFactory.openSession().get(Category.class, id);
	}

	@Transactional
	public boolean delete(Category category) {

		try {
			if (get(category.getId()) != null) {
				return false;
			}

			sessionFactory.getCurrentSession().delete(category);

			return true;

		}

		catch (HibernateException e) {

			e.printStackTrace();

			return false;

		}

	}

	@Transactional
	public List<Category> list() {
		// return null;
		System.out.println("In category List fun");
		System.out.println("In list");
		String hql = "from Category";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();

	}

	@Transactional
	public boolean delete(String id) {
		try {
			sessionFactory.getCurrentSession().delete(id);
		} catch (HibernateException e) {

			e.printStackTrace();
			return false;
		}
		return true;
	}

}
