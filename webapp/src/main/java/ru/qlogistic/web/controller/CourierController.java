package ru.qlogistic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;
import ru.qlogistic.web.request.AddressSaveRequest;
import ru.qlogistic.web.request.PhoneSaveRequest;
import ru.qlogistic.web.request.PurseSaveRequest;

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

    @RequestMapping(value = "/personal/phonesave", method = RequestMethod.POST)
    public Object savePhoneNumber(@ModelAttribute("phoneSaveRequest") PhoneSaveRequest request, BindingResult bindingResult, RedirectAttributes attr){
        /*if(bindingResult.hasErrors())
            return "client_private";*/
        User currentUser = userService.findByUsername(request.getEmail());
        currentUser.setTelephoneNumber(request.getPhoneNumber());
        userService.saveOrUpdate(currentUser);
        return new RedirectView("/courier/personal");
    }

    @RequestMapping(value = "/personal/pursesave", method = RequestMethod.POST)
    public Object savePurseNumber(@ModelAttribute("purseSaveRequest") PurseSaveRequest request, BindingResult bindingResult, RedirectAttributes attr){
        /*if(bindingResult.hasErrors())
            return "client_private";*/
        User currentUser = userService.findByUsername(request.getEmail());
        currentUser.setPurseNumber(request.getPurseNumber());
        userService.saveOrUpdate(currentUser);
        return new RedirectView("/courier/personal");
    }

    @RequestMapping(value = "/personal/addresssave", method = RequestMethod.POST)
    public Object saveAddress (@ModelAttribute("addressSaveRequest") AddressSaveRequest request, BindingResult bindingResult, RedirectAttributes attr){
        /*if(bindingResult.hasErrors())
            return "client_private";*/
        User currentUser = userService.findByUsername(request.getEmail());
        currentUser.setAddress(request.toAddress());
        userService.saveOrUpdate(currentUser);
        return new RedirectView("/courier/personal");
    }

}
