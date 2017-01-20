package com.hello.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.dal.repositories.IRepository;

@Controller
@RequestMapping(value = "/")

public class HomeController {
	
	@Autowired
	private IRepository productRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model){
		model.addAttribute("products",productRepository.getAllProducts());
		return "home";
	}
}
