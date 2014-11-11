package ru.qlogistic.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/error")
public class ErrorHandler {

    @RequestMapping(value = "access_denied", method = RequestMethod.GET)
    public String accessDenied(){
        return "access_denied";
    }

}
