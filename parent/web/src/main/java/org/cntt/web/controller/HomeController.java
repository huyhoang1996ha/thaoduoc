package org.cntt.web.controller;

import org.cntt.model.product.Product;
import org.cntt.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(value={"/home"},method=RequestMethod.GET)
	public String home(){
		return "home";
	}
//	@RequestMapping(value="/product",method=RequestMethod.GET)
//	public String product(@RequestParam int id,Model model){
//		Product product=productService.findOne(id);
//		model.addAttribute("product", product);
//		return "product";
//	}
}
