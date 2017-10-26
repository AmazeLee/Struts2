package com.sh.d_config;


import com.opensymphony.xwork2.ActionSupport;

public class Demo3Action extends ActionSupport{
	
	private String name;
	@Override
	public String execute() throws Exception {
		name="jrrry";//从数据库查询
		return super.execute();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
