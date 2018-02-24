package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IIncomeBusiness;
import com.geinek.value.IncomeValue;


@Controller("incomeListAction")
@Scope("prototype")
public class ListIncomeAction {
	IIncomeBusiness ib = null;
	private IncomeValue iv = null;
	private List<IncomeValue> incomeList = null;
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
	@Autowired
	public void setIb(IIncomeBusiness ib) {
		this.ib = ib;
	}
	public String toList() throws Exception
	{
		incomeList = ib.getList();
		return "tolist";
	}
}
