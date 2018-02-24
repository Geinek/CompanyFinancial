package com.geinek.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller("userLogoutAction")
@Scope("prototype")
public class UserLogout {
	public String logout() throws Exception
	{
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.invalidate();
		
		return "login";
		
	}
}
