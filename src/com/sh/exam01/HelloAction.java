package com.sh.exam01;

public class HelloAction {
	/**
	 * 提供一个默认的执行方法：execute
	 * @return
	 */
	public String execute() {
		
		System.out.println("HelloAction中的execute执行了");
		return "success";
	}
}
