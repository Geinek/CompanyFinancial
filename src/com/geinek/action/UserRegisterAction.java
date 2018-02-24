package com.geinek.action;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IUserBusiness;
import com.geinek.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("userRegisterAction")
@Scope("prototype")
public class UserRegisterAction {
	private IUserBusiness ub = null;
	private UserValue uv = null;
	private File photo=null;
	private String photoFileName=null;
	private String photoContentType=null;
	
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
	

	public File getPhoto() {
		return photo;
	}


	public void setPhoto(File photo) {
		this.photo = photo;
	}


	public String getPhotoFileName() {
		return photoFileName;
	}


	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}


	public String getPhotoContentType() {
		return photoContentType;
	}


	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}


	public String register() throws Exception 
	{
		if(photoFileName==null||photoFileName.equals("")){
			ub.register(uv);
		}
		else{
			ub.register(uv, photo, photoFileName, photoContentType);
		}
		return "register";
	}
}
