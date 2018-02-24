package com.geinek.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IUserBusiness;
import com.geinek.value.UserValue;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller("userLoginAction")
@Scope("prototype")
public class UserLoginAction extends ActionSupport {
	
	private IUserBusiness ub = null;
	
	private String username = null;
	private String password = null;
	

	
	
	@Autowired
	public void setUb(IUserBusiness ub) {
		this.ub = ub;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public void validate() {
		if(username == null || username.trim().equals("")){
			addFieldError("username","用户名不能为空");
		}
		if(password == null || password.trim().equals("")){
			addFieldError("password","密码不能为空");
		}
		try {
			if(!ub.validate(username, password) && username!=null && password!=null && !username.trim().equals("") && !password.trim().equals("")) {
				addFieldError("username","用户名或密码错误");
				addFieldError("password","用户名或密码错误");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String execute() throws Exception 
	{
		UserValue uv=ub.getUser(username);
		ActionContext ac=ActionContext.getContext();
		Map session=ac.getSession();
		session.put("user", uv);
		return "success";
	}
}
