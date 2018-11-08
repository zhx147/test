package com.zss.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.zss.dao.AdminDao;
import com.zss.entity.Mylogintable;
import com.zss.util.SafeUtil;;


@Service	// 注解为service层spring管理bean
@Transactional	// 注解此类所有方法加入spring事务, 具体设置默认
public class AdminService {

	@Resource		//spring注入类对象
	private AdminDao adminDao;
	
	
	/*
	public boolean  checkUser(String username, String password){
		return adminDao.getByUsernameAndPassword(username, SafeUtil.encode(password)) != null;
	}
	*/
	
	public String  checkUser(String username, String password){
		return adminDao.getByUsernameAndPassword(username, SafeUtil.encode(password));
	}
	
	
	
	public boolean isExist(String username) {
		return adminDao.getByUsername(username) != null;
	}

	//本例需要的唯一服务
	public String add(Mylogintable admin) {
		admin.setMypassword((SafeUtil.encode(admin.getMypassword())));
		return adminDao.save(admin);
	}
	
}
