package com.geinek.business;

import java.util.List;

import com.geinek.value.ExependValue;


public interface IExependBusiness {
	public void add(String no,double exepend,String purpose,String type,int year,int month,int dno) throws Exception;
	
	public void add(ExependValue ev) throws Exception;
	
	public void modify(ExependValue ev) throws Exception;
	
	
	public void delete(ExependValue ev) throws Exception;

	
	public ExependValue getExepend(String no) throws Exception;

	public List<ExependValue> getList() throws Exception;
	
	public List<ExependValue> getListByAllWithPage(int rows,int pageIndex) throws Exception;
	
	public List<ExependValue> getListByExepend(double low,double high) throws Exception;
}
