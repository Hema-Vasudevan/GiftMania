package com.niit.giftmania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftmania.dao.ProductDao;
import com.niit.giftmania.dao.UserDao;
import com.niit.giftmania.model.User;

public class CrudUser {
	
	public CrudUser() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("resource")
	 public static void main(String[] args)
	    {
			     
	}
	public void add(User s)
	{
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	      ctx.scan("com.niit.giftmania.config");
	      ctx.refresh();
	      UserDao us=(UserDao)ctx.getBean("userBean");
	      System.out.println(s);
	      us.addUser(s);
	}
	public User check(String uname)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	      ctx.scan("com.niit.giftmania.config");
	      ctx.refresh();
	      UserDao us=(UserDao)ctx.getBean("userBean");
	      User s=us.getuserByName(uname);
	      return s;
	}
}
