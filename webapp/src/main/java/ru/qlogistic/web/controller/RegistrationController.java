package ru.qlogistic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ru.qlogistic.logic.model.Role;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.RoleService;
import ru.qlogistic.logic.service.UserService;
import ru.qlogistic.web.request.UserSaveRequest;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Controller("registrationController")
@RequestMapping(value = "/registration")
public class RegistrationController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public ModelAndView showClientRegistration(){
        ModelAndView modelAndView = new ModelAndView("client_reg_form");
        modelAndView.getModel().put("client", new UserSaveRequest());
        return modelAndView;
    }

    @RequestMapping(value = "/courier", method = RequestMethod.GET)
    public ModelAndView showCourierRegistration(){
        ModelAndView modelAndView = new ModelAndView("courier_reg_form");
        modelAndView.getModel().put("courier", new UserSaveRequest());
        return modelAndView;
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") @Valid UserSaveRequest request, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "client_reg_form";
        }
        // check if user with name is already exists
        if(!checkUserAlreadyExists(request)){
            bindingResult.addError(new FieldError("client", "username", "{validation.error.user.already.exists}"));
            return "client_reg_form";
        }
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        Set<Role> rolesForClient = new HashSet<Role>();
        rolesForClient.add(roleService.findRoleByRole("CLIENT"));
        user.setRoles(rolesForClient);
        userService.saveOrUpdate(user);
        return "login";
    }

    private boolean checkUserAlreadyExists(UserSaveRequest request) {
        return userService.findByUsername(request.getUsername()) == null;
    }

    @RequestMapping(value = "/courier", method = RequestMethod.POST)
    public String saveCourier(@ModelAttribute("courier")@Valid UserSaveRequest request, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "courier_reg_form";
        }
        // check if user with name is already exists
        if(!checkUserAlreadyExists(request)){
            bindingResult.addError(new FieldError("courier", "username", "{validation.error.user.already.exists}"));
            return "courier_reg_form";
        }
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        Set<Role> rolesForCourier = new HashSet<Role>();
        rolesForCourier.add(roleService.findRoleByRole("COURIER"));
        user.setRoles(rolesForCourier);
        userService.saveOrUpdate(user);
        return "login";
    }

}
