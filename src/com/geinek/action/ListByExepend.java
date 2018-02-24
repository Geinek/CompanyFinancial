package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IExependBusiness;
import com.geinek.value.ExependValue;

@Controller("listByExependAction")
@Scope("prototype")
public class ListByExepend {
	IExependBusiness eb = null;
	private ExependValue ev = null;
	private List<ExependValue> exependList = null;
	private double low;
	private double high;
	
	@Autowired
	public void setEb(IExependBusiness eb) {
		this.eb = eb;
	}

	public ExependValue getEv() {
		return ev;
	}

	public void setEv(ExependValue ev) {
		this.ev = ev;
	}

	public List<ExependValue> getExependList() {
		return exependList;
	}

	public void setExependList(List<ExependValue> exependList) {
		this.exependList = exependList;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}
	
	public String toList() throws Exception
	{
		exependList = eb.getListByExepend(low, high);
		System.out.println(exependList.size());
		return "tolist";
	}
}
