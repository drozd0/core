package ru.qlogistic.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("clientController")
@RequestMapping(value = "/client")
//@PreAuthorize("hasRole('CLIENT')")
public class ClientController extends ClientMenuController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(){
        return "client";
    }

}
