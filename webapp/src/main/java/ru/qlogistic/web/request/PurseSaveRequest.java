package ru.qlogistic.web.request;

import org.hibernate.validator.constraints.NotBlank;

public class PurseSaveRequest {
    @NotBlank
    private String email;
    @NotBlank(message = "{validation.error.username.not.blank}")
    private String purseNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPurseNumber() {
        return purseNumber;
    }

    public void setPurseNumber(String purseNumber) {
        this.purseNumber = purseNumber;
    }
}
