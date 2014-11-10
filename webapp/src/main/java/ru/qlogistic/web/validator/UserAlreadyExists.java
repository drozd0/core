package ru.qlogistic.web.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Constraint(validatedBy = UserAlreadyExistsValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAlreadyExists {

    String message() default "{validation.user.already.exists}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
