package com.geinek.business;

import java.util.List;

import com.geinek.value.DepartmentValue;

public interface IDepartmentBusiness {
	public void add(String dcode,String dname,String mname,int num) throws Exception;
	
	public void add(DepartmentValue dv) throws Exception;
	
	public void modify(DepartmentValue dv) throws Exception;
	public void modify(int dep_id,String dcode,String dname,String mname,int num) throws Exception;
	
	
	public void delete(DepartmentValue dv) throws Exception;
	
	public int getDepartmentCount() throws Exception;
	
	public DepartmentValue getDepartment(int no) throws Exception;

	public List<DepartmentValue> getListAllWithoutFinance() throws Exception;

	public List<DepartmentValue> getListAllWithFinance() throws Exception;
	
	public List<DepartmentValue> getListAllWithProfit() throws Exception;
}
