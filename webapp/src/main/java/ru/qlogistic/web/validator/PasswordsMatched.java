package ru.qlogistic.web.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = PasswordsMatchedValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordsMatched {

    String message() default "{validation.password.does.not.match}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String pass();

    String rePass();
}
