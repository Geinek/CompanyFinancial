package com.geinek.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geinek.business.IManagerBusiness;
import com.geinek.value.IncomeValue;
import com.geinek.value.ManagerValue;


@Service("managerBusiness")
@Transactional
public class ManagerBusinessImpl implements IManagerBusiness {
	
	private SessionFactory sf = null;
	
	
	@Autowired
	public ManagerBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}


	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	

	@Override
	public void add(String no, String mname, String sex, int age, String edu, String title, int dno) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(ManagerValue iv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(iv);
	}

	@Override
	public void modify(ManagerValue iv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(iv);
	}

	@Override
	public void delete(ManagerValue mv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(mv); 
	}

	@Override
	public ManagerValue getManager(String no) throws Exception {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		ManagerValue ev=session.get(ManagerValue.class, no);
		return ev;
	}

	@Override
	public List<ManagerValue> getList() throws Exception {
		// TODO Auto-generated method stub
		String hql="from ManagerValue";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		List<ManagerValue> list=query.list();
		return list;
	}


	@Override
	public void delete(String mno) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
