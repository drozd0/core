package ru.qlogistic.web.request;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public class UserSaveRequest {
    @NotBlank(message = "{validation.error.username.not.blank}")
    @Email(message = "{validation.error.field.email}")
    private String username;
    @NotBlank(message = "{validation.error.password.not.blank}")
    private String password;
    private String retypedPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypedPassword() {
        return retypedPassword;
    }

    public void setRetypedPassword(String retypedPassword) {
        this.retypedPassword = retypedPassword;
    }
}
