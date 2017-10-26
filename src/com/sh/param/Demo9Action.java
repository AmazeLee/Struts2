package com.sh.param;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.domain.User;

/**
 * 
 * @author Administrator
 *
 */
public class Demo9Action extends ActionSupport {

	private User user;

	public String execute() throws Exception {

		System.out.println(user);

		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
