package com.niit.giftmania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftmania.dao.ProductDao;
import com.niit.giftmania.dao.UserDao;
import com.niit.giftmania.model.Product;
import com.niit.giftmania.model.User;

public class InserProd {
	
	public InserProd() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("resource")
	 public static void main(String[] args)
	    {
		 
	}
	public void addp(Product p)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	      ctx.scan("com.niit.giftmania.config");
	      ctx.refresh();
	      ProductDao pd=(ProductDao)ctx.getBean("productBean");
	      pd.addProduct(p);
	}
	public void remove(Integer pid)
	{
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	      ctx.scan("com.niit.giftmania.config");
	      ctx.refresh();
	      ProductDao pd=(ProductDao)ctx.getBean("productBean");
	      pd.removeProduct(pid);
	}
	public void update(Product p)
	{
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	      ctx.scan("com.niit.giftmania.config");
	      ctx.refresh();
	      ProductDao pd=(ProductDao)ctx.getBean("productBean");
	      pd.updateProduct(p);
	}
}
