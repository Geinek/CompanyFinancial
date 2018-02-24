package com.geinek.business;

import java.util.List;

import com.geinek.value.ManagerValue;


public interface IManagerBusiness {
	
	public void add(String no,String mname,String sex,int age,String edu,String title,int dno) throws Exception;
	
	public void add(ManagerValue iv) throws Exception;
	
	public void modify(ManagerValue iv) throws Exception;
	
	
	public void delete(ManagerValue mv) throws Exception;
	
	public void delete(String mno) throws Exception;

	
	public ManagerValue getManager(String no) throws Exception;

	public List<ManagerValue> getList() throws Exception;
}
