package com.zss.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;
import com.zss.entity.Mylogintable;
import com.zss.service.AdminService;

@Namespace("/test")
@Results({
	@Result(name="success",location="/test/success.jsp"),
	@Result(name="loginsuccess",location="/test/loginsuccess.jsp"),
})
public class UserAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	@Resource
	private AdminService userService;
	private Mylogintable oneuser; 
	/**
	 * 注册用户
	 * @return
	 */
	@Action("register")
	public String register(){
		    userService.add(oneuser);
			addActionMessage("注册成功, 请登录!");
			return "success";
	}
	
	
	@Action("login")
	public String login(){
		    //case1:用户名和密码均正确
		    //case2:用户名正确，密码不正确
		    //case3:无此用户名
		    String loginresult=userService.checkUser(oneuser.getMyusername(),oneuser.getMypassword());
		    System.out.println("loginresult="+loginresult);
		    ActionContext.getContext().put("loginresult", loginresult);
		    return "loginsuccess";
	}
	
	public Mylogintable getOneuser() {
		return oneuser;
	}
	public void setOneuser(Mylogintable oneuser) {
		this.oneuser = oneuser;
	}

}