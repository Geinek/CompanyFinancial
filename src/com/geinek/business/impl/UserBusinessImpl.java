package com.geinek.business.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;

import org.hibernate.LobHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geinek.business.IUserBusiness;
import com.geinek.value.UserValue;

@Service("userBusiness")
@Transactional
public class UserBusinessImpl implements IUserBusiness {
	
	private SessionFactory sf=null;
	

	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void register(UserValue uv) throws Exception {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		session.save(uv);
	}

	@Override
	public boolean validate(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean result=false;
		
		Session session=sf.getCurrentSession();
		
		String hql="select count(uv.username) from UserValue uv where uv.username=:username and uv.password=:password";
		Query query=session.createQuery(hql);
		query.setString("username",username);
		query.setString("password",password);
		long count=(Long)query.uniqueResult();
		if(count>0){
			result=true;
		}
		
		return result;
	}

	@Override
	public void register(UserValue uv, File photo, String photoFileName, String photoContentType) throws Exception {
		// TODO Auto-generated method stub
		uv.setPhotoFileName(photoFileName);
		uv.setPhotoContentType(photoContentType);
		LobHelper lh=sf.getCurrentSession().getLobHelper();
		InputStream in=new FileInputStream(photo);
		Blob bphoto=lh.createBlob(in,in.available());
		uv.setPhoto(bphoto);
		
		sf.getCurrentSession().save(uv);
	}

	@Override
	public UserValue getUser(String username) throws Exception {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		UserValue uv=session.get(UserValue.class, username);
		return uv;
	}

}
