package com.geinek.value;

public class IncomeValue {
	private String i_id = null;
	private double income = 0.0f;
	private String purpose = null;
	private String type = null;
	private int year = 0;
	private int month = 0;
	private DepartmentValue dv = null;
	
	public String getI_id() {
		return i_id;
	}
	public void setI_id(String i_id) {
		this.i_id = i_id;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
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
