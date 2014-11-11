package ru.qlogistic.web.request;

import org.hibernate.validator.constraints.NotBlank;

public class PhoneSaveRequest {

    @NotBlank
    private String email;
    @NotBlank(message = "{validation.error.username.not.blank}")
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
