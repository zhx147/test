package com.zss.dao;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {

	@Resource
	private SessionFactory sessionFactory;
	private Session session;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		this.session = sessionFactory.getCurrentSession();
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	
	
	
	public <T> T get(Class<T> clazz, Serializable id){
		return (T)getSession().get(clazz, id);
	}
	
	
	public String save(Object object){
		return (String) getSession().save(object);
	}
	
	
	public boolean update(Object object){
		try {
			getSession().update(object);
		} catch (HibernateException e) {
			return false;
		}return true;
	}
	
	
	public boolean delete(Object object){
		try {
			getSession().delete(object);
		} catch (HibernateException e) {
			return false;
		}return true;
	}

}