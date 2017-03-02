package org.cntt.web.controller;

import javax.validation.Valid;

import org.cntt.model.product.Product;
import org.cntt.model.user.User;
import org.cntt.product.service.ProductService;
import org.cntt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(value={"/"},method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String product(Model model){
		Product product=productService.find();
		model.addAttribute("product", product);
		return "product";
	}
	@Autowired
	UserService userService;
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute(value="User")User user, Model model,BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			return "error";
		}
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("passWord", user.getPassWord());
		userService.saveUser(user);
		return "done";
	}
	@RequestMapping(value={"/registered"},method=RequestMethod.GET)
	public ModelAndView registered(){
		return new ModelAndView("registered", "User", new User());
	}
}
