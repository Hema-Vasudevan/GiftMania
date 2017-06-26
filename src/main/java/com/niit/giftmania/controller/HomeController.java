package com.niit.giftmania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.giftmania.CrudProd;
import com.niit.giftmania.CrudUser;
import com.niit.giftmania.dao.ProductDaoImple;
import com.niit.giftmania.model.Product;
import com.niit.giftmania.model.User;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


@Controller 
public class HomeController {
	@RequestMapping("/")
	public String gotoHome()
	{
		return "home";
	}
	@RequestMapping("/home")
	public String gotohome()
	{
		return "home";
	}
	@RequestMapping("/abt")
	public String gotoAbt()
	{
		return "abt";
	}
	@RequestMapping("/sign")
	public String gotoSign()
	{
		return "sign";
	}
	@RequestMapping("/admin")
	public String gotoAdmin()
	{
		return "admin";
	}
	@RequestMapping("/process")
	public String gotoProces(HttpServletRequest request, ModelMap model)
	{
		String pd=request.getParameter("pid");
		Integer pid=Integer.parseInt(pd.trim());
		String pname=request.getParameter("pname");
		String pdes=request.getParameter("pdesc");
		String pcat=request.getParameter("pcat");
		String price=request.getParameter("price");
		Integer pr=Integer.parseInt(price);
		Product p=new Product(pid,pname,pdes,pcat,pr);
		CrudProd ip=new CrudProd();
		ip.addp(p);
		return "home";
	}
	@RequestMapping("/update")
	public String gotoUpdate(HttpServletRequest request, ModelMap model)
	{
		String pd=request.getParameter("pid");
		Integer pid=Integer.parseInt(pd.trim());
		String pname=request.getParameter("pname");
		String pdes=request.getParameter("pdesc");
		String pcat=request.getParameter("pcat");
		String price=request.getParameter("price");
		Integer pr=Integer.parseInt(price);
		Product p=new Product(pid,pname,pdes,pcat,pr);
		CrudProd ip=new CrudProd();
		ip.update(p);
		return "home";
	}
	@RequestMapping("/delete")
	public String gotoDelete(HttpServletRequest request, ModelMap model)
	{
		String pd=request.getParameter("pid");
		Integer pid=Integer.parseInt(pd.trim());
		Product p1=new Product(pid);
		CrudProd ip1=new CrudProd();
		ip1.remove(pid);
		return "home";
	}
	@RequestMapping("/login")
	public String gotoLogin()
	{
		return "login";
	}
	
	@RequestMapping("/loginh")
	public String LoginValidation(HttpServletRequest request)
	{
	String uname=request.getParameter("uname");
	String pwd=request.getParameter("pwd");
	User s=new User(uname,pwd);
	CrudUser cu=new CrudUser();
	User s1=cu.check(uname);
	if(s1.getRole().equals("user"))
		return "welcome";
	else if(s1.getRole().equals("admin"))
		return "admin";
	else
		return "login";
	}
}


