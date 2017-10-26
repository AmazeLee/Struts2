package com.sh.a_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 拦截器第一种创建方式
 * 
 * @author Administrator 拦截器生命周期：随项目的启动而创建，随项目关闭而销毁
 */
public class MyInterceptor implements Interceptor {

	@Override
	// 销毁方法
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	// 初始化方法
	public void init() {
		// TODO Auto-generated method stub
	}

	@Override
	// 拦截方法
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
