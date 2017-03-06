package com.niit.giftmania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.giftmania.InserProd;
import com.niit.giftmania.dao.ProductDaoImple;
import com.niit.giftmania.model.Product;

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
	public String gotoSign(HttpServletRequest request, ModelMap model)
	{
		return "sign";
	}
	@RequestMapping("/admin")
	public String gotoAdmin(HttpServletRequest request, ModelMap model)
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
		Product p=new Product(pid,pname,pdes,pcat);
		InserProd ip=new InserProd();
		ip.addp(p);
		return "process";
	}
	@RequestMapping("/update")
	public String gotoUpdate(HttpServletRequest request, ModelMap model)
	{
		String pd=request.getParameter("pid");
		Integer pid=Integer.parseInt(pd.trim());
		String pname=request.getParameter("pname");
		String pdes=request.getParameter("pdesc");
		String pcat=request.getParameter("pcat");
		Product p=new Product(pid,pname,pdes,pcat);
		InserProd ip=new InserProd();
		ip.update(p);
		return "update";
	}
	@RequestMapping("/delete")
	public String gotoDelete(HttpServletRequest request, ModelMap model)
	{
		String pd=request.getParameter("pid");
		Integer pid=Integer.parseInt(pd.trim());
		Product p1=new Product(pid);
		InserProd ip1=new InserProd();
		ip1.remove(pid);
		return "delete";
	}
	@RequestMapping("/login")
	public String gotoLogin()
	{
		return "login";
	}
	@RequestMapping("/product")
	public String gotoProducts(HttpServletRequest request, ModelMap model)
	{
		String produ=request.getParameter("prod");
		switch(produ)
		{
			case "Men": model.addAttribute("prodname","Men");
					 break;
			case "Women": model.addAttribute("prodname","Women");
					 break;
			case "Children": model.addAttribute("prodname", "Children");
					 break;
		}
		ProductDaoImple produt=new ProductDaoImple();
		List<Product> list2=produt.getProductbyCategory(produ);
		model.addAttribute("list3",list2);
		return "product";
		}
	
}
