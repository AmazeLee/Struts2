package com.sh.c_param;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ValueStack;
import com.sh.bean.User;

public class Demo2Action extends ActionSupport implements ModelDriven<User> /* Preparable */ {

	private User u = new User();

	@Override
	public String execute() throws Exception {

		System.out.println(u);
		return SUCCESS;
	}
	@Override
	public User getModel() {
		// 压入栈顶
		// 获得值栈
		ValueStack vs = ActionContext.getContext().getValueStack();
		// 将u压入栈顶
		vs.push(u);
		return u;
	}
	
	/*@Override
	public void prepare() throws Exception {
		// 压入栈顶
		// 获得值栈
		ValueStack vs = ActionContext.getContext().getValueStack();
		// 将u压入栈顶
		vs.push(u);
	}*/
}
