package ru.qlogistic.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("clientController")
@RequestMapping(value = "/client")
@PreAuthorize("hasRole('CLIENT')")
public class ClientController extends ClientMenuController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(){
        return "client";
    }

    @RequestMapping(value = "/personal", method = RequestMethod.GET)
    public ModelAndView showAccountSettings(ModelAndView mav, Authentication auth){
        mav.getModelMap().addAttribute("currentUser", getCurrentUser(auth));
        mav.setViewName("client_private");
        return mav;
    }

}
