package com.geinek.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geinek.business.IIncomeBusiness;
import com.geinek.value.ExependValue;
import com.geinek.value.IncomeValue;

@Service("incomeBusiness")
@Transactional
public class IncomeBusinessImpl implements IIncomeBusiness {
	
	private SessionFactory sf = null;
	
	
	@Autowired
	public IncomeBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}


	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	

	@Override
	public void add(String no, double income, String purpose, String type, int year, int month, int dno)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(IncomeValue iv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(iv);
	}

	@Override
	public void modify(IncomeValue iv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(iv);
	}

	@Override
	public void delete(IncomeValue iv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(iv);
	}

	@Override
	public IncomeValue getIncome(String no) throws Exception {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		IncomeValue ev = session.get(IncomeValue.class, no);
		return ev;
	}

	@Override
	public List<IncomeValue> getList() throws Exception {
		// TODO Auto-generated method stub
		String hql="from IncomeValue";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		List<IncomeValue> list=query.list();
		return list;
	}


	@Override
	public List<IncomeValue> getListByAllWithPage(int rows, int pageIndex) throws Exception {
		// TODO Auto-generated method stub
		String hql="from IncomeValue iv";
		
		Session session=sf.getCurrentSession();
		
		Query query=session.createQuery(hql);
		
		query.setFirstResult(rows*(pageIndex-1));
		query.setMaxResults(rows);
		
		List<IncomeValue> list=query.list();
		
		return list;
	}


	@Override
	public List<IncomeValue> getListByIncome(double low, double high) throws Exception {
		// TODO Auto-generated method stub
		String hql="from IncomeValue iv where iv.income between :low and :high";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setDouble("low", low);
		query.setDouble("high", high);
		List<IncomeValue> list=query.list();
		
		
		return list;
	}

}
