package com.geinek.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geinek.business.IDepartmentBusiness;
import com.geinek.value.DepartmentValue;

@Service("departmentBusiness")
@Transactional
public class DepartmentBusinessImpl implements IDepartmentBusiness {
	
	private SessionFactory sf=null;
	
	@Autowired
	public DepartmentBusinessImpl(SessionFactory sf){
		this.sf=sf;
	}
		
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(String dcode, String dname,String mname,int num) throws Exception {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		DepartmentValue dv=new DepartmentValue();
		dv.setDcode(dcode);
		dv.setDname(dname);
		dv.setMname(mname);
		dv.setNum(num);
		session.save(dv);
		tx.commit();
		session.close();
	}

	@Override
	public void add(DepartmentValue dv) throws Exception {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		session.save(dv);
	}

	@Override
	public void modify(DepartmentValue dv) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modify(int dep_id, String dcode, String dname,String mname,int num) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DepartmentValue dv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(dv);
	}

	@Override
	public DepartmentValue getDepartment(int no) throws Exception {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
			
		DepartmentValue dv=session.get(DepartmentValue.class, no);
		
		tx.commit();
		session.close();
		
		return dv;
	}

	@Override
	public List<DepartmentValue> getListAllWithoutFinance() throws Exception {
		// TODO Auto-generated method stub
		String hql = "from DepartmentValue";
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		List<DepartmentValue> list = query.list();
		return list;
	}

	@Override
	public List<DepartmentValue> getListAllWithFinance() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDepartmentCount() throws Exception {
		// TODO Auto-generated method stub
		String hql="select count(dv.dep_id) from DepartmentValue dv";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		int count=((Long)query.uniqueResult()).intValue();
		
		return count;
	}

	@Override
	public List<DepartmentValue> getListAllWithProfit() throws Exception {
		// TODO Auto-generated method stub
		
		//String hql = "from IncomeValue iv left outer join ExependValue ev on iv.dv.dep_id=ev.dv.dep_id and iv.year=ev.year and iv.month=ev.month";
		String hql="from DepartmentValue";
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		List<DepartmentValue> list = query.list();
		return list;
	}

}
