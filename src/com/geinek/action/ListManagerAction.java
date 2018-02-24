package com.geinek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.geinek.business.IManagerBusiness;
import com.geinek.value.ManagerValue;


@Controller("managerListAction")
@Scope("prototype")
public class ListManagerAction {
	IManagerBusiness ib = null;
	private ManagerValue mv = null;
	private List<ManagerValue> managerList = null;
	

	
	public ManagerValue getMv() {
		return mv;
	}

	public void setMv(ManagerValue mv) {
		this.mv = mv;
	}

	public List<ManagerValue> getManagerList() {
		return managerList;
	}

	public void setManagerList(List<ManagerValue> managerList) {
		this.managerList = managerList;
	}

	@Autowired
	public void setIb(IManagerBusiness ib) {
		this.ib = ib;
	}
	
	public String toList() throws Exception
	{
		managerList = ib.getList();
		return "tolist";
	}
}
