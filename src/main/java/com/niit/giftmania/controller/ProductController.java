package com.niit.giftmania.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.niit.giftmania.CrudProd;
import com.niit.giftmania.model.Product;

@Controller
public class ProductController {

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
		CrudProd ip=new CrudProd();
		List<Product> list2=ip.getProduct(produ);
		Gson gson = new Gson();
		String json;
		json=gson.toJson(list2);
		
		//model.addAttribute("list3",list2);
		model.addAttribute("prodlist",json);
		return "product";
		}

}
