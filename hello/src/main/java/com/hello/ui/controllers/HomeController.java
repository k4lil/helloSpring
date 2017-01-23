package com.hello.ui.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		model.addAttribute("products",productRepository.getAllProducts());
		return "home";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addOrUpdate(Model model){
		model.addAttribute("product", new Product());
		return "add";
	}
	
	@RequestMapping(value="/saveProduct",method=RequestMethod.POST)
	public String addOrUpdate(@Valid Product p,BindingResult result,Model model){
		if(result.hasErrors()){
			return "add";
		}
		productRepository.addOrUpdateProduct(p);
		return "redirect:/";
	}
	
	@RequestMapping(value="/editProduct",method=RequestMethod.GET)
	public String editProduct(Model model, Long id){
		Product p = productRepository.getProduct(id);
		model.addAttribute("product", p);
		return "add";
	}
	
	
}
