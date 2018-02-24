package com.geinek.action;

import java.io.InputStream;
import java.sql.Blob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IUserBusiness;
import com.geinek.value.UserValue;

@Controller("userPhotoShowAction")
@Scope("prototype")
public class UserPhotoShow {
	private IUserBusiness ub = null;
	private UserValue uv = null;
	private String username = null;
	private String fileName=null;
	private String contentType=null;
	
	
	@Autowired
	public void setUb(IUserBusiness ub) {
		this.ub = ub;
	}



	public UserValue getUv() {
		return uv;
	}



	public void setUv(UserValue uv) {
		this.uv = uv;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public String getContentType() {
		return contentType;
	}



	public void setContentType(String contentType) {
		this.contentType = contentType;
	}



	public InputStream getInputStream() throws Exception{ 
		
		uv=ub.getUser(username);
		Blob photo=uv.getPhoto();
		fileName=uv.getPhotoFileName();
		contentType=uv.getPhotoContentType();
		
		return photo.getBinaryStream();
		
	}
	
	public String show() throws Exception
	{
		return "show";
	}
}
