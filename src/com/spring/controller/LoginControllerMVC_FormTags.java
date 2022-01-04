package com.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.account.Account;

@Controller
public class LoginControllerMVC_FormTags {

	@RequestMapping("/signupNewUserMVCTags")
	public String signupNewUser(@Valid @ModelAttribute("signUpData") Account account, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "studentFrontMVC-Form-Tags/signup";
		} else {

			return "profile";
		}
	}
}
