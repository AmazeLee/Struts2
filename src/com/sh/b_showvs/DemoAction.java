package com.sh.b_showvs;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("DemoAction");
		return SUCCESS;
	}

}
