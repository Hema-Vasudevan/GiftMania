//package com.niit.giftmania.controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.niit.giftmania.dao.UserDao;
//import com.niit.giftmania.model.User;
//
//@Controller
//public class LoginController {
//
//	@Autowired
//	private UserDao userdao;
//	
//	@RequestMapping(value = "/loginh", method = RequestMethod.POST)
//	public String LoginValidation(HttpSession session, @ModelAttribute User user, Model model)
//	{
//		User fetchUser = userdao.getuserByName(user.getUname());
//		try{
//			if(user.getPwd().equals(fetchUser.getPwd()))
//			{
//				/* session.setAttribute("Name", fetchUser.getFname());
//				session.setAttribute("LoggedIn", true);
//				session.setAttribute("UserBean", fetchUser); */
//				return "welcome";
//			}
//			
//			else 
//			{
//				model.addAttribute("Error", "Password Incorrect");
//				return "login";
//			}
//		}
//		catch (NullPointerException e)
//		{
//			model.addAttribute("Error", "Username not registered");
//		}
//		return "login";
//	}
//
//}
//
////public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
////@RequestParam(value = "logout",	required = false) String logout) {
////	
////	ModelAndView model = new ModelAndView();
////	if (error != null) {
////		model.addObject("error", "Invalid Credentials provided.");
////	}
////
////	if (logout != null) {
////		model.addObject("message", "Logged out successfully.");
////	}
////
////	model.setViewName("login");
////	return model;
////}