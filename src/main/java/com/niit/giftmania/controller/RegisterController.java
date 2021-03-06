package com.niit.giftmania.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.giftmania.CrudUser;
import com.niit.giftmania.dao.UserDao;
import com.niit.giftmania.model.User;

@Controller
public class RegisterController {

	@RequestMapping("/welcome")
	public String gotoWelcome(HttpServletRequest request)
	{
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gen=request.getParameter("gender");
		String nat=request.getParameter("nationality");
		String cn=request.getParameter("country");
		String city=request.getParameter("city");
		String add=request.getParameter("addr");
		String pin=request.getParameter("pin");
		String eid=request.getParameter("emailid");		
		String uname=request.getParameter("usrname");
		String pwd=request.getParameter("passwd");
		User s=new User(fname,lname,cn,nat,gen,city,add,pin,eid,uname,pwd,"user");
		CrudUser is=new CrudUser();
		is.add(s);
		return "home";
	}

}
