package com.geinek.value;

public class ManagerValue {
	private String m_id = null;
	private String mname = null;
	private String sex = null;
	private int age = 0;
	private String edu = null;
	private String title = null;
	private DepartmentValue dptv = null;
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public DepartmentValue getDptv() {
		return dptv;
	}
	public void setDptv(DepartmentValue dptv) {
		this.dptv = dptv;
	}

	
}
