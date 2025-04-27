package org.isdb.email.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.isdb.email.validator.RoleValidator;

import jakarta.validation.Constraint;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = RoleValidator.class)
public @interface ValidRole {
	String message() default "Invalid role";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}