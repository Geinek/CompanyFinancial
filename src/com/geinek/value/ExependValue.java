package com.geinek.value;

public class ExependValue {
	private String e_id = null;
	private double exepend = 0.0f;
	private String purpose = null;
	private String type = null;
	private int year = 0;
	private int month = 0;
	private DepartmentValue dv = null;
	
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public double getExepend() {
		return exepend;
	}
	public void setExepend(double exepend) {
		this.exepend = exepend;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public DepartmentValue getDv() {
		return dv;
	}
	public void setDv(DepartmentValue dv) {
		this.dv = dv;
	}
	
}
