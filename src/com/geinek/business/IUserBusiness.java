package com.geinek.business;

import java.io.File;

import com.geinek.value.UserValue;

public interface IUserBusiness {
	public void register(UserValue uv) throws Exception;
	public void register(UserValue uv,File photo,String photoFileName,String photoContentType) throws Exception;
	public boolean validate(String username,String password) throws Exception;
	public UserValue getUser(String username) throws Exception;
}
