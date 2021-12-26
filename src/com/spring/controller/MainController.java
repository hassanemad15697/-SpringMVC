package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	// http://localhost:8080/SpringMVC/
	public String main() {
		return "mainPage";
	}

	@RequestMapping("/profile")
	// http://localhost:8080/SpringMVC/profile
	public String profile() {
		return "myProfile";
	}

	@RequestMapping("/login")
	// http://localhost:8080/SpringMVC/login
	public String login() {
		return "login";
	}

	
	@RequestMapping("/loginProcess")
	// http://localhost:8080/SpringMVC/loginProcess
	public String loginFormProcess(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		
		// getting parameters from login form by @RequestParam("username") String username 

		// processing on parameters
		username = "Ciao " + username.toUpperCase();
		password = "Your Password is: " + password.toLowerCase();

		// returning processed data to new page
		model.addAttribute("processedUsername", username);
		model.addAttribute("processedPassword", password);

		return "myProfile";
	}
}
