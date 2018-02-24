package com.geinek.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IDepartmentBusiness;
import com.geinek.business.IIncomeBusiness;
import com.geinek.value.DepartmentValue;
import com.geinek.value.IncomeValue;


@Controller("incomeMainAction")
@Scope("prototype")
public class IncomeMainAction {
	private IIncomeBusiness ib = null;
	private IDepartmentBusiness db = null;
	private IncomeValue iv = null;
	private DepartmentValue dv = null;
	private String id = null;
	private List<IncomeValue> incomeList = null;
	private List<DepartmentValue> departmentList = null;
	private List<String> typeList = null;

	
	@Autowired
	public void setIb(IIncomeBusiness ib) {
		this.ib = ib;
	}
	
	@Autowired
	public void setDb(IDepartmentBusiness db) {
		this.db = db;
	}
	
	public IncomeValue getIv() {
		return iv;
	}
	public void setIv(IncomeValue iv) {
		this.iv = iv;
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

	public List<IncomeValue> getIncomeList() {
		return incomeList;
	}
	public void setIncomeList(List<IncomeValue> incomeList) {
		this.incomeList = incomeList;
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
	public String add() throws Exception
	{
		ib.add(iv);
		return "add";
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
	
	public String modify() throws Exception
	{
		ib.modify(iv);
		return "modify";
	}
	
	public String delete() throws Exception
	{
		iv = ib.getIncome(id);
	    ib.delete(iv);
		return "delete";
	}
}
