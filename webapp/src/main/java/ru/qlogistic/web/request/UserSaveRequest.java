package ru.qlogistic.web.request;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import ru.qlogistic.web.validator.PasswordsMatched;
import ru.qlogistic.web.validator.UserAlreadyExists;

@Validated
@PasswordsMatched(pass="password", rePass="rePassword")
public class UserSaveRequest {
    @NotBlank(message = "{validation.error.username.not.blank}")
    @Email(message = "{validation.error.field.email}")
    @UserAlreadyExists
    private String username;
    @NotBlank(message = "{validation.error.password.not.blank}")
    private String password;
    private String rePassword;

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

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
