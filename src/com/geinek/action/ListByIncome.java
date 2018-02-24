package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IIncomeBusiness;
import com.geinek.value.IncomeValue;

@Controller("listByIncomeAction")
@Scope("prototype")
public class ListByIncome {
	IIncomeBusiness ib = null;
	private IncomeValue iv = null;
	private List<IncomeValue> incomeList = null;
	private double low;
	private double high;
	
	@Autowired
	public void setIb(IIncomeBusiness ib) {
		this.ib = ib;
	}

	public IncomeValue getIv() {
		return iv;
	}

	public void setIv(IncomeValue iv) {
		this.iv = iv;
	}

	public List<IncomeValue> getIncomeList() {
		return incomeList;
	}

	public void setIncomeList(List<IncomeValue> incomeList) {
		this.incomeList = incomeList;
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
		incomeList = ib.getListByIncome(low, high);
		System.out.println(incomeList.size());
		return "tolist";
	}
}
