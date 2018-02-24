package com.geinek.business;

import java.util.List;

import com.geinek.value.IncomeValue;

public interface IIncomeBusiness {
	
	public void add(String no,double income,String purpose,String type,int year,int month,int dno) throws Exception;
	
	public void add(IncomeValue iv) throws Exception;
	
	public void modify(IncomeValue iv) throws Exception;
	
	
	public void delete(IncomeValue iv) throws Exception;

	
	public IncomeValue getIncome(String no) throws Exception;

	public List<IncomeValue> getList() throws Exception;

	public List<IncomeValue> getListByAllWithPage(int rows,int pageIndex) throws Exception;
	
	public List<IncomeValue> getListByIncome(double low,double high) throws Exception;
}
