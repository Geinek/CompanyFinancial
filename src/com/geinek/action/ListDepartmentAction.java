package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IDepartmentBusiness;
import com.geinek.value.DepartmentValue;

@Controller("departmentListAction")
@Scope("prototype")
public class ListDepartmentAction {
	IDepartmentBusiness db = null;
	private DepartmentValue dv = null;
	private List<DepartmentValue> departmentList = null;
	private int departmentNo = 0;
	private int departmentCount = 0;
	
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
	public List<DepartmentValue> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<DepartmentValue> departmentList) {
		this.departmentList = departmentList;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public int getDepartmentCount() {
		return departmentCount;
	}
	public void setDepartmentCount(int departmentCount) {
		this.departmentCount = departmentCount;
	}
	public String toview() throws Exception
	{
		dv = db.getDepartment(dv.getDep_id());
		return "toiew";
	}
	
	public String toList() throws Exception
	{
		departmentList = db.getListAllWithoutFinance();
		return "tolist";
	}
	public String toCount() throws Exception
	{
		
		return "tocount";
	}
}
