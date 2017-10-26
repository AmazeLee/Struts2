package com.sh.b_servlet_api;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 如何在action中获得原生ServletAPI
 * @author Administrator
 *
 */
public class Demo5Action extends ActionSupport{
	
	public String execute() throws Exception {
		//request域 => map	(struts2并不推荐使用原生request域)
		Map<String, Object> requestScope = (Map<String, Object>) ActionContext.getContext().get("request");
		//推荐
		ActionContext.getContext().put("name", "requestTom");
		
		//Session域 => map
		Map<String, Object> sessionScope = ActionContext.getContext().getSession();
		sessionScope.put("name", "sessionTom");
		
		//application域 => map
		Map<String, Object> applicationScope = ActionContext.getContext().getApplication();
		applicationScope.put("name", "applicationTom");
		return SUCCESS;
	}
}
