package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home(Model model) {
		display();
		userService.hello();
		return"home";
	}
	private void display() {
		//throw new ArrayIndexOutOfBoundsException("There is no index, Please check once");
		//throw new NumberFormatException("Please check your number");
		throw new RuntimeException("Hello!!!");
	}
	

}
