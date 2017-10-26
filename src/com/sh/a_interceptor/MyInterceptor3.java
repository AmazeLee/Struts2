package com.sh.a_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 拦截器第三种创建方式:继承MethodFilterInterceptor 方法过滤拦截器
 * @author Administrator
 * 功能：定制拦截器拦截的方法	定制需要拦截的方法 	定制哪些方法不需要拦截
 */
public class MyInterceptor3 extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		//前处理
		System.out.println("MyInterceptor3前处理");
		
		//放行
		invocation.invoke();
		
		//后处理
		System.out.println("MyInterceptor3后处理");
		
		//不放行，直接跳转一个结果页面，不执行后续的拦截器以及Action,直接交给Result处理页面结果进行页面跳转
		return "success";
	}
}
