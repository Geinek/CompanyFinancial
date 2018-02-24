package com.geinek.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IDepartmentBusiness;
import com.geinek.value.DepartmentValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("departmentProcessAction")
@Scope("prototype")
public class DepartmentProcessAction extends ActionSupport{
	private IDepartmentBusiness db=null;
	private DepartmentValue dv=null;
	private int id = 0;  
	
	@Autowired
	public void setDb(IDepartmentBusiness db) {
		this.db = db;
	}

	public DepartmentValue getDv() {
		return dv;
	}

	public void setDv(DepartmentValue dv) {
		this.dv = dv;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String addDep() throws Exception
	{
		db.add(dv);
		return "main";
	}
	
	public String modify() throws Exception
	{
		db.modify(dv);
		return "modify";
	}

	public String delete() throws Exception
	{
		dv = db.getDepartment(id);
		db.delete(dv);
		return "delete";
	}
}
