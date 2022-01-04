package com.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	//it's called pre-proccess method, used to check if the data that came from web request has a spaces
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class	, editor);
	}
}
