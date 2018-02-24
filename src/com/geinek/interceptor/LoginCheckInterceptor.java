package com.geinek.interceptor;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginCheckInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//System.out.println("登录检查拦截器销毁。。。");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		//System.out.println("登录检查拦截器初始化。。。");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("登录检查拦截器拦截方法。。。");
		Map session=ActionContext.getContext().getSession();
		String name = ai.getInvocationContext().getName();
		if(name.equals("login")){
			return ai.invoke();
		}
		if(name.equals("register")) {
			return ai.invoke();
		}
		if(session.get("user")==null){
			System.out.println("user is null");
			return "login";
		}
		else{
			String result=ai.invoke();
			System.out.println("user is not null");
			return result;
		}
	}

}
