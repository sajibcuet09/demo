package com.example.demo.controller;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =
        SumOfValuesEqualsToOneHundredValidator.class)
public @interface SumOfValuesEqualsToOneHundred {
    String message() default "Sum of fields doesn't equal to 100";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
