package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public String home(){
		return "home";
	}
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("products",productService.findAll());
		return "products";
	}
	
	@RequestMapping(value="/product/{productId}", method=RequestMethod.GET)
	public String getProduct(Model model){
		model.addAttribute("products",productService.findAll());
		return "products";
	}
}
