package com.spring.controller;

import org.springframework.stereotype.Controller;
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
	public String loginFormProcess() {
		//http://localhost:8080/SpringMVC/loginProcess
		return "myProfile";
	}
}
