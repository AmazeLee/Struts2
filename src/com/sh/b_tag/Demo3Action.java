package com.sh.b_tag;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Demo3Action extends ActionSupport{

	private String name;
	@Override
	public String execute() throws Exception {
		System.out.println(name);
		this.addActionError("麦田守望者");
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
