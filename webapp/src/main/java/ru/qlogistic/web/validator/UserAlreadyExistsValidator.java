package ru.qlogistic.web.validator;

import org.springframework.beans.factory.annotation.Autowired;
import ru.qlogistic.logic.service.UserService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserAlreadyExistsValidator implements ConstraintValidator<UserAlreadyExists, String> {
    @Autowired
    private UserService userService;

    @Override
    public void initialize(UserAlreadyExists userAlreadyExists) {
       // do nothing
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintValidatorContext) {
        return userService.findByUsername(object) == null;
    }
}
