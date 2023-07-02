package com.springbootregistrationform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootregistrationform.entity.User;
import com.springbootregistrationform.service.UserService;

@Controller
public class UserController {
     
	 @Autowired
	    private UserService userService;
	    
	    @GetMapping("/")
	    public String showRegistrationForm(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	        return "register";
	    }
	    
	    @PostMapping("/registerUser")
	    public String registerUser(@ModelAttribute("user") User user) {
	        userService.registerUser(user);
	        return "redirect:/home";
	    }
	    
	    @GetMapping("/home")
	    public String homePage() {
	        return "home";
	    }
}
