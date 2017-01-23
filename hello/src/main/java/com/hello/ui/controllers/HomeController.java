package com.hello.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.dal.models.Product;
import com.hello.dal.repositories.IRepository;

@Controller
@RequestMapping(value = "/")

public class HomeController {
	
	@Autowired
	private IRepository productRepository;
	
	public void setProductRepository(IRepository productRepository) {
		this.productRepository = productRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("product", new Product());
		model.addAttribute("products",productRepository.getAllProducts());

		return "home";
	}
	
	@RequestMapping(value="/saveProduct",method=RequestMethod.POST)
	public String addOrUpdate(Product p,Model model){
		productRepository.addOrUpdateProduct(p);
		return "redirect:/";
	}
}
