package com.zss.dao;

import org.springframework.stereotype.Repository;
import com.zss.entity.Mylogintable;
@Repository // 注册dao层bean等同于@Component
public class AdminDao extends BaseDao{

	/**
	 * 通过用户名查找
	 * @param username
	 * @return
	 */
	public Object getByUsername(String username) {
		return getSession().createQuery("from Mylogintable where myusername=:username",Mylogintable.class)
				.setParameter("username", username).uniqueResult();
	}
	
	/**
	 * 通过用户名和密码查找
	 * @param username
	 * @param password
	 * @return 无记录返回null
	 */
	
	
	/*
	public Mylogintable getByUsernameAndPassword(String username, String password){
		return getSession().createQuery("from Mylogintable where myusername=:username and mypassword=:password",Mylogintable.class)
				.setParameter("username", username).setParameter("password", password).uniqueResult();
	}
    */
	
	public String  getByUsernameAndPassword(String username, String password){

          
		if(getSession().createQuery("from Mylogintable where myusername=:username and mypassword=:password",Mylogintable.class)
				.setParameter("username", username).setParameter("password", password).uniqueResult()!=null)		
			return "case1";
			
		else  {	
			Mylogintable  oneobject=getSession().createQuery("from Mylogintable where myusername=:username",Mylogintable.class)
			.setParameter("username", username).uniqueResult();
			if  (oneobject!=null) 
				return "case2";
			          else
			    return "case3";
	    }
	
	}
	
	
}