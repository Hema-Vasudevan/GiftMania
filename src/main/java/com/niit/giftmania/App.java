package com.niit.giftmania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftmania.dao.ProductDao;
import com.niit.giftmania.dao.UserDao;
import com.niit.giftmania.model.Product;
import com.niit.giftmania.model.User;

public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args)
    {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
      ctx.scan("com.niit.giftmania.config");
      ctx.refresh();
      ProductDao pd=(ProductDao)ctx.getBean("productBean");
      UserDao us=(UserDao)ctx.getBean("userBean");
}
}