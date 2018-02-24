package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IExependBusiness;
import com.geinek.value.ExependValue;

@Controller("exependPagesAction")
@Scope("prototype")
public class ExependPagesAction {
	private IExependBusiness ib = null;
	private List<ExependValue> exependList = null;
	private int rows = 10;
	private int pageIndex = 1;
	
	@Autowired
	public void setIb(IExependBusiness ib) {
		this.ib = ib;
	}

	public List<ExependValue> getExependList() {
		return exependList;
	}

	public void setExependList(List<ExependValue> exependList) {
		this.exependList = exependList;
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
		exependList = ib.getListByAllWithPage(rows, pageIndex);
		
		return "tomain";
	}
	
	
}
