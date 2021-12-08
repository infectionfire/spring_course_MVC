package com.ivanovsegei.spring.mvc.validation;

import javax.validation.*;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail, String> {//использует дженерики

    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        ConstraintValidator.super.initialize(checkEmail);
        endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue
            , ConstraintValidatorContext constraintValidatorContext) {

        return enteredValue.endsWith(endOfEmail);//проверка окончания емейла
    }
}
