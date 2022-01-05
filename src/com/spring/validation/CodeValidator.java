package com.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeValidator implements ConstraintValidator<VerifyPhone, String> {

	private String myPhone;

	@Override
	public void initialize(VerifyPhone phone) {
		myPhone = phone.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
		if (code != null) {
			return code.startsWith(myPhone);
		} else {
			return true;
		}
	}

}
