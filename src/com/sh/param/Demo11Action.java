package com.sh.param;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * struts2 封装集合类型参数
 * @author Administrator
 *
 */
public class Demo11Action extends ActionSupport{

	private List<String> list;

	public String execute() throws Exception {

		System.out.println("list:"+list);

		return SUCCESS;
	}

}
