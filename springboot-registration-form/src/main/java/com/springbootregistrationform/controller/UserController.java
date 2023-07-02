package com.springbootregistrationform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootregistrationform.entity.User;

@Controller
public class UserController {
     
	@GetMapping("/")
	public String register(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
		
	}
	//What i will be receiving 
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) 
	{
		System.out.println(user);
		 // Redirect to the home page
		return "home";
	}
}
