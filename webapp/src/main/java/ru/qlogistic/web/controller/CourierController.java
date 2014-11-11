package ru.qlogistic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.qlogistic.logic.service.UserService;

@Controller("courierController")
@RequestMapping(value = "/courier")
@PreAuthorize("hasRole('COURIER')")
public class CourierController extends CourierMenuController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String init(){
        return "courier";
    }

    @RequestMapping(value = "/personal", method = RequestMethod.GET)
    public ModelAndView showAccountSettings(ModelAndView mav){
        mav.getModelMap().addAttribute("currentUser", userService.getCurrentUser());
        mav.setViewName("courier_private");
        return mav;
    }
}
