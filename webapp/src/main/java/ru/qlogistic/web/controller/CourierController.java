package ru.qlogistic.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("courierController")
@RequestMapping(value = "/courier")
@PreAuthorize("hasRole('COURIER')")
public class CourierController extends CourierMenuController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(){
        return "courier";
    }

    @RequestMapping(value = "/personal", method = RequestMethod.GET)
    public ModelAndView showAccountSettings(ModelAndView mav, Authentication auth){
        mav.getModelMap().addAttribute("currentUser", getCurrentUser(auth));
        mav.setViewName("courier_private");
        return mav;
    }
}
