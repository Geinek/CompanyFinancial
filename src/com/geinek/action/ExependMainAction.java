package com.geinek.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IDepartmentBusiness;
import com.geinek.business.IExependBusiness;
import com.geinek.value.DepartmentValue;
import com.geinek.value.ExependValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("exependMainAction")
@Scope("prototype")
public class ExependMainAction extends ActionSupport {
	private IExependBusiness eb = null;
	private IDepartmentBusiness db = null;
	private ExependValue ev = null;
	private DepartmentValue dv = null;
	private String id = null;
	private List<ExependValue> exependList = null;
	private List<DepartmentValue> departmentList = null;
	private List<String> typeList = null;
	
	@Autowired
	public void setEb(IExependBusiness eb) {
		this.eb = eb;
	}
	@Autowired
	public void setDb(IDepartmentBusiness db) {
		this.db = db;
	}
	public ExependValue getEv() {
		return ev;
	}
	public void setEv(ExependValue ev) {
		this.ev = ev;
	}
	public DepartmentValue getDv() {
		return dv;
	}
	public void setDv(DepartmentValue dv) {
		this.dv = dv;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ExependValue> getExependList() {
		return exependList;
	}
	public void setExependList(List<ExependValue> exependList) {
		this.exependList = exependList;
	}
	public List<DepartmentValue> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<DepartmentValue> departmentList) {
		this.departmentList = departmentList;
	}
	
	public List<String> getTypeList() {
		return typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}
	
	public String toadd() throws Exception
	{
		typeList = new ArrayList<String>();
		typeList.add("研发类");
		typeList.add("财务类");
		typeList.add("市场类");
		typeList.add("投资类");
		typeList.add("业务类");
		departmentList = db.getListAllWithoutFinance();
		this.setDepartmentList(departmentList);
		return "toadd";
	}
	public String tomodify() throws Exception
	{
		typeList = new ArrayList<String>();
		typeList.add("研发类");
		typeList.add("财务类");
		typeList.add("市场类");
		typeList.add("投资类");
		typeList.add("业务类");
		departmentList = db.getListAllWithoutFinance();
		this.setDepartmentList(departmentList);
		return "tomodify";
	}
	public String add() throws Exception
	{
		eb.add(ev);
		return "add";
	}
	
	public String modify() throws Exception
	{
		eb.modify(ev);
		return "modify";
	}
	
	public String delete() throws Exception
	{
		ev = eb.getExepend(id);
	    eb.delete(ev);
		return "delete";
	}
	
}
