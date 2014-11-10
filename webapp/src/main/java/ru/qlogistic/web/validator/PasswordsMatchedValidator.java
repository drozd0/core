package ru.qlogistic.web.validator;

import org.apache.commons.beanutils.PropertyUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordsMatchedValidator implements ConstraintValidator<PasswordsMatched, Object> {
    private String password;
    private String rePassword;

    @Override
    public void initialize(PasswordsMatched constraintAnnotation) {
        this.password = constraintAnnotation.pass();
        this.rePassword = constraintAnnotation.rePass();

    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        try {
            String password = (String) PropertyUtils.getProperty(object, this.password);
            String rePassword = (String) PropertyUtils.getProperty(object, this.rePassword);
            return password.equals(rePassword);
        } catch (Exception e) {
            // ignore
        }
        return false;
    }
}
