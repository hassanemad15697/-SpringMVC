package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.account.Account;

@Controller
public class LoginController {

	@RequestMapping("/signupNewUser")
	public String signupNewUser(@RequestParam("name") String Name,@RequestParam("email") String Email,
								@RequestParam("password") String Password,@RequestParam("age") String Age,
								@RequestParam("age") String Deparment,
								Model model) {
		
		Account account = new Account();
		account.setAge(Age+"years");
		account.setEmail(Email);
		account.setName(Name.toUpperCase());
		account.setPassword(Password);
		account.setDepartment(Deparment);
		model.addAttribute("signUpData",account);
		
		return "profile";
	}
}
