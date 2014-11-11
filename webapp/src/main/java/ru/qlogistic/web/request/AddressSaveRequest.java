package ru.qlogistic.web.request;

import org.hibernate.validator.constraints.NotBlank;
import ru.qlogistic.logic.model.Address;

public class AddressSaveRequest {

    @NotBlank
    private String email;
    @NotBlank(message = "{validation.error.username.not.blank}")
    private String city;
    @NotBlank(message = "{validation.error.username.not.blank}")
    private String street;
    @NotBlank(message = "{validation.error.username.not.blank}")
    private String building;
    @NotBlank(message = "{validation.error.username.not.blank}")
    private String flat;

    public Address toAddress(){
        Address address = new Address();
        address.setCity(this.city);
        address.setStreet(this.street);
        address.setBuildingNum(this.building);
        address.setFlatNum(this.flat);
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
