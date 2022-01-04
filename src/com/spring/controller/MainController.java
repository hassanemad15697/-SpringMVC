package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.account.Account;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "mainPage";
	}

	@RequestMapping("/signup")
	public String signup() {

		return "studentFront/signup";
	}

	@RequestMapping("/signin")
	public String signin() {

		return "studentFront/signin";
	}

	@RequestMapping("/signupMVCTags")
	public String signupMVCTags(Model model) {

		Account account = new Account();
		model.addAttribute("signUpData", account);
		
		return "studentFrontMVC-Form-Tags/signup";
	}

	@RequestMapping("/signinMVCTags")
	public String signinMVCTags() {

		return "studentFrontMVC-Form-Tags/signin";
	}
}
