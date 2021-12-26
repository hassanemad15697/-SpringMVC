package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		//http://localhost:8080/SpringMVC/
		return "mainPage";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		//http://localhost:8080/SpringMVC/profile
		return "myProfile";
	}
	
	@RequestMapping("/login")
	public String login() {
		//http://localhost:8080/SpringMVC/login
		return "login";
	}
	
	@RequestMapping("/loginProcess")
	public String loginFormProcess(HttpServletRequest request, Model model) {
		//http://localhost:8080/SpringMVC/loginProcess
		
		//getting parameters from login form
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//processing on parameters
		username="Ciao "+username.toUpperCase();
		password="Your Password is: "+password.toLowerCase();
		
		//returning processed data to new page
		model.addAttribute("processedUsername", username);
		model.addAttribute("processedPassword", password);
		
		
		return "myProfile";
	}
}
