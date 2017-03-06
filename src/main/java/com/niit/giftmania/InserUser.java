package com.niit.giftmania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftmania.dao.ProductDao;
import com.niit.giftmania.dao.UserDao;
import com.niit.giftmania.model.User;

public class InserUser {
	
	public InserUser() {
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
	      ProductDao pd=(ProductDao)ctx.getBean("productBean");
	      UserDao us=(UserDao)ctx.getBean("userBean");
	      System.out.println(s);
	      us.addUser(s);
	}
}
