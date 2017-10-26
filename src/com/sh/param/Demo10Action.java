package com.sh.param;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sh.domain.User;

/**
 * @author Administrator
 *
 */
public class Demo10Action extends ActionSupport implements ModelDriven<User>{

	private User user = new User();

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

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
}
