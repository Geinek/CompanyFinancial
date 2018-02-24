package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IIncomeBusiness;
import com.geinek.value.IncomeValue;

@Controller("incomePagesAction")
@Scope("prototype")
public class IncomePagesAction {
	private IIncomeBusiness ib = null;
	private List<IncomeValue> incomeList = null;
	private int rows = 10;
	private int pageIndex = 1;
	
	@Autowired
	public void setIb(IIncomeBusiness ib) {
		this.ib = ib;
	}

	public List<IncomeValue> getIncomeList() {
		return incomeList;
	}

	public void setIncomeList(List<IncomeValue> incomeList) {
		this.incomeList = incomeList;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	public String tomain() throws Exception
	{
		incomeList = ib.getListByAllWithPage(rows, pageIndex);
		
		return "tomain";
	}
}
