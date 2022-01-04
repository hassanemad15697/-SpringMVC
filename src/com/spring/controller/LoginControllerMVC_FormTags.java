package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.account.Account;

@Controller
public class LoginControllerMVC_FormTags {

	@RequestMapping("/signupNewUserMVCTags")
	public String signupNewUser(@ModelAttribute("signUpData") Account account) {


		return "profile";
	}
}
