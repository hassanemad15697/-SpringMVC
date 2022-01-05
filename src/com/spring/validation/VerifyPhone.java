package com.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Constraint(validatedBy = CodeValidator.class)
public @interface VerifyPhone {
	public String value() default "+02";

	public String message() default "Invalid Phone";

	public Class<?>[] groups() default{};

	public Class<? extends Payload>[] payload() default {};
	
}
