package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IExependBusiness;
import com.geinek.value.ExependValue;


@Controller("exependListAction")
@Scope("prototype")
public class ListExependAction {
	IExependBusiness eb = null;
	private ExependValue dv = null;
	private List<ExependValue> exependList = null;

	
	public ExependValue getDv() {
		return dv;
	}

	public void setDv(ExependValue dv) {
		this.dv = dv;
	}

	public List<ExependValue> getExependList() {
		return exependList;
	}

	public void setExependList(List<ExependValue> exependList) {
		this.exependList = exependList;
	}

	@Autowired
	public void setDb(IExependBusiness eb) {
		this.eb = eb;
	}
	
	public String toList() throws Exception
	{
		exependList = eb.getList();
		return "tolist";
	}
}
