package com.geinek.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IDepartmentBusiness;
import com.geinek.business.IManagerBusiness;
import com.geinek.value.DepartmentValue;
import com.geinek.value.ManagerValue;
import com.opensymphony.xwork2.ActionSupport;


@Controller("managerMainAction")
@Scope("prototype")
public class ManagerMainAction  {
	private IManagerBusiness mb = null;
	private IDepartmentBusiness db = null;
	private ManagerValue mv = null;
	private DepartmentValue dv = null;
	private String id = null;
	private List<ManagerValue> managerList = null;
	private List<DepartmentValue> departmentList = null;
	private List<String> titleList = null;
	private List<String> eduList = null;
	private List<String> sexList = null;
	
	@Autowired
	public void setMb(IManagerBusiness mb) {
		this.mb = mb;
	}
	
	@Autowired
	public void setDb(IDepartmentBusiness db) {
		this.db = db;
	}
	public ManagerValue getMv() {
		return mv;
	}
	public void setMv(ManagerValue mv) {
		this.mv = mv;
	}
	public DepartmentValue getDv() {
		return dv;
	}
	public void setDv(DepartmentValue dv) {
		this.dv = dv;
	}
	public List<ManagerValue> getManagerList() {
		return managerList;
	}
	public void setManagerList(List<ManagerValue> managerList) {
		this.managerList = managerList;
	}
	public List<DepartmentValue> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<DepartmentValue> departmentList) {
		this.departmentList = departmentList;
	}
	public List<String> getTitleList() {
		return titleList;
	}
	public void setTitleList(List<String> titleList) {
		this.titleList = titleList;
	}
	public List<String> getEduList() {
		return eduList;
	}
	public void setEduList(List<String> eduList) {
		this.eduList = eduList;
	}
	public List<String> getSexList() {
		return sexList;
	}
	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toadd() throws Exception
	{
		titleList = new ArrayList<String>();
		titleList.add("初级");
		titleList.add("中级");
		titleList.add("高级");
		
		eduList = new ArrayList<String>();
		eduList.add("专科");
		eduList.add("本科");
		eduList.add("研究生");
		eduList.add("博士");
		
		sexList = new ArrayList<String>();
		sexList.add("男");
		sexList.add("女");
		
		departmentList = db.getListAllWithoutFinance();
		return "toadd";
	}
	public String add() throws Exception
	{
		mb.add(mv);
		return "add";
	}
	
	public String delete() throws Exception
	{
		mv = mb.getManager(id);
	    mb.delete(mv);
		return "delete";
	}
	
	public String tomodify() throws Exception
	{
		titleList = new ArrayList<String>();
		titleList.add("初级");
		titleList.add("中级");
		titleList.add("高级");
		
		eduList = new ArrayList<String>();
		eduList.add("专科");
		eduList.add("本科");
		eduList.add("研究生");
		eduList.add("博士");
		
		sexList = new ArrayList<String>();
		sexList.add("男");
		sexList.add("女");
		
		departmentList = db.getListAllWithoutFinance();
		return "tomodify";
	}
	
	public String modify() throws Exception
	{
	    mb.modify(mv);
		return "modify";
	}
}
