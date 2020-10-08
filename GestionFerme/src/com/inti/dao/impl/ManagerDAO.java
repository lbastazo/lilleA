package com.inti.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.inti.dao.interfaces.IDAO;
import com.inti.utils.HibernateUtility;

public class ManagerDAO<T> implements IDAO<T>{
	
	@Override
	public void save(T obj) {
		Session s = HibernateUtility.getSessionFactory().openSession();
		try {
			s.getTransaction().begin();
			s.persist(obj);
			s.getTransaction().commit();
			s.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void update(T obj) {
		Session s = HibernateUtility.getSessionFactory().openSession();
		try {
			s.getTransaction().begin();
			s.merge(obj);
			s.getTransaction().commit();
			s.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(T obj) {
	Session s = HibernateUtility.getSessionFactory().openSession();
		
		try {
			s.getTransaction().begin();
			s.delete(obj);
			s.getTransaction().commit();
			s.flush();
			s.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<T> findAll(Class<?> c) {
		Session s = HibernateUtility.getSessionFactory().openSession();
		try {
			s.getTransaction().begin();
			Query queryHQL = s.createQuery(" from " + c.getName());
			List<T> liste = queryHQL.list();
			
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (HibernateException ex) {

			return null;
			}
	}

	@Override
	public T findOne(Class<?> c, Long id) {
		Session s = HibernateUtility.getSessionFactory().openSession();
		T t;
		s.getTransaction().begin();
		t= (T) s.get(c, id);
		return t;
	}

}
