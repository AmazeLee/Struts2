package com.sh.a_ognl;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.sh.bean.User;

import ognl.Ognl;
import ognl.OgnlContext;

//展示OGNL语法
public class Demo {

	@Test
	// 准备工作
	public void fun1() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		// 将rootUser作为root部分
		oc.setRoot(rootUser);
		// 将context这个Map作为Context部分
		oc.setValues(context);
		// 书写OGNL
		Ognl.getValue("", oc, oc.getRoot());
	}

	@Test
	// 基本语法演示
	// 取出root中的属性值
	public void fun2() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		// 书写OGNL

		// 取出root中user对象的name属性
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("age", oc, oc.getRoot());
		System.out.println(name);
		System.out.println(age);
	}

	@Test
	// 基本语法演示
	// 取出context中的属性值
	public void fun3() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		// 书写OGNL

		// 取出root中user对象的name属性
		String name = (String) Ognl.getValue("#user1.name", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("#user1.age", oc, oc.getRoot());
		System.out.println(name + ":" + age);
	}

	@Test
	// 基本语法演示
	// 为属性赋值
	public void fun4() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		// 书写OGNL

		Ognl.getValue("name='jerry'", oc, oc.getRoot());
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());
		System.out.println(name);

		Ognl.getValue("#user1.name='麦客子'", oc, oc.getRoot());
		String name1 = (String) Ognl.getValue("#user1.name", oc, oc.getRoot());
		System.out.println(name1);
	}

	@Test
	// 基本语法演示
	// 调用方法
	public void fun5() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		// 书写OGNL

		Ognl.getValue("setName('孙悟空')", oc, oc.getRoot());
		String name = (String) Ognl.getValue("getName()", oc, oc.getRoot());
		System.out.println(name);

		String name1 = (String) Ognl.getValue("#user1.setName('猪八戒'),#user1.getName()", oc, oc.getRoot());
		System.out.println(name1);
	}

	@Test
	// 基本语法演示
	// 调用静态方法
	public void fun6() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		// 书写OGNL

		String name = (String) Ognl.getValue("@com.sh.a_ognl.HahaUtils@echo('hello java')", oc, oc.getRoot());
		/*
		 * double name1 = (double) Ognl.getValue("@ java.lang.Math@PI", oc,
		 * oc.getRoot());
		 */
		double name1 = (double) Ognl.getValue("@@PI", oc, oc.getRoot());
		System.out.println(name);
		System.out.println(name1);

	}

	@Test
	// 基本语法演示
	// ognl创建对象list|map
	public void fun7() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		// 书写OGNL

		// 创建list
		Integer size = (Integer) Ognl.getValue("{'宝钗','黛玉','晴雯'}.size()", oc, oc.getRoot());
		String name = (String) Ognl.getValue("{'宝钗','黛玉','晴雯'}[0]", oc, oc.getRoot());
		String name2 = (String) Ognl.getValue("{'宝钗','黛玉','晴雯'}[0]", oc, oc.getRoot());
		System.out.println(size);
		System.out.println(name);
		System.out.println(name2);

		// 创建map
		Integer size2 = (Integer) Ognl.getValue("#{'name':'宝钗','age':'18'}.size()", oc, oc.getRoot());
		String name3 = (String) Ognl.getValue("#{'name':'宝钗','age':'18'}['name']", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("#{'name':'宝钗','age':18}.get('age')", oc, oc.getRoot());

		System.out.println(size2);
		System.out.println(name3);
		System.out.println(age);
	}
}
