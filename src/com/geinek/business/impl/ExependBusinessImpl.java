package com.geinek.business.impl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geinek.business.IExependBusiness;
import com.geinek.value.DepartmentValue;
import com.geinek.value.ExependValue;
import com.geinek.value.IncomeValue;

@Service("exependBusiness")
@Transactional
public class ExependBusinessImpl implements IExependBusiness{
	
	private SessionFactory sf = null;
	
	
	@Autowired
	public ExependBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(String no,double exepend, String purpose, String type, int year, int month, int dno)
			throws Exception {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		ExependValue ev = new ExependValue();
		ev.setE_id(no);
		ev.setExepend(exepend);
		ev.setPurpose(purpose);
		ev.setType(type);
		ev.setYear(year);
		ev.setMonth(month);
		DepartmentValue dv = session.get(DepartmentValue.class, dno);
		ev.setDv(dv);
		session.save(ev);
	}

	@Override
	public void add(ExependValue ev) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(ev);
	}

	@Override
	public void modify(ExependValue ev) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(ev);
	}

	@Override
	public void delete(ExependValue ev) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(ev);
	}

	@Override
	public ExependValue getExepend(String no) throws Exception {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		ExependValue ev = session.get(ExependValue.class, no);
		return ev;
	}

	@Override
	public List<ExependValue> getList() throws Exception {
		// TODO Auto-generated method stub
	
		String hql="from ExependValue";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		List<ExependValue> list=query.list();
		return list;
	}

	@Override
	public List<ExependValue> getListByAllWithPage(int rows, int pageIndex) throws Exception {
		// TODO Auto-generated method stub
		String hql="from ExependValue ev";
		
		Session session=sf.getCurrentSession();
		
		Query query=session.createQuery(hql);
		
		query.setFirstResult(rows*(pageIndex-1));
		query.setMaxResults(rows);
		
		List<ExependValue> list=query.list();
		
		return list;
	}

	@Override
	public List<ExependValue> getListByExepend(double low, double high) throws Exception {
		// TODO Auto-generated method stub
		String hql="from ExependValue ev where ev.exepend between :low and :high";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setDouble("low", low);
		query.setDouble("high", high);
		List<ExependValue> list=query.list();
		
		
		return list;
	}


}
