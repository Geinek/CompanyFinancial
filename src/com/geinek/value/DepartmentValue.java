package com.geinek.value;

import java.util.Set;

public class DepartmentValue {
	private int dep_id;
	private String dcode;
	private String dname;
	private String mname;
	private int num;
	private Set<ExependValue> ev = null;
	private Set<IncomeValue> iv = null;
	
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Set<ExependValue> getEv() {
		return ev;
	}
	public void setEv(Set<ExependValue> ev) {
		this.ev = ev;
	}
	public Set<IncomeValue> getIv() {
		return iv;
	}
	public void setIv(Set<IncomeValue> iv) {
		this.iv = iv;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
