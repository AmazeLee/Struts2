package com.sh.a_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 拦截器第二种创建方式:继承AbstractInterceptor
 * @author Administrator
 * 帮我们空实现了init和destroy方法，我们如果不需要实现这两个方法，就可以只实现intercept方法
 */
public class MyInterceptor2 extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
