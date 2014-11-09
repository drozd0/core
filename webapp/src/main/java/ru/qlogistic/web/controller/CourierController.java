package ru.qlogistic.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("courierController")
@RequestMapping(value = "/courier")
//@PreAuthorize("hasRole('COURIER')")
public class CourierController extends CourierMenuController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(){
        return "courier";
    }
}
