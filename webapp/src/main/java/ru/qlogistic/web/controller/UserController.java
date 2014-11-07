package ru.qlogistic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.qlogistic.logic.model.Role;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.RoleService;
import ru.qlogistic.logic.service.UserService;

import java.util.ArrayList;
import java.util.Set;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /*@RequestMapping(value = "/user/add")
    public ModelAndView saveUser(UserRegistrationForm userForm, BindingResult bind){
        ModelAndView view = new ModelAndView();
        if(!bind.hasErrors()){
            view.setViewName("redirect:/login");
            Role role = roleService.findRoleById(userForm.getRole_id());
            Set<Role> roleSet = new HashSet<Role>();
            roleSet.add(role);

            User user = new User();
            user.setUsername(userForm.getUsername());
            user.setPassword(passwordEncoder.encode(userForm.getPassword()));
            userService.saveOrUpdate(user);
            user.setRoles(roleSet);
            userService.saveOrUpdate(user);
        }
        return view;
    }*/

    @RequestMapping(value = "/user/update")
    public ModelAndView updateUser(User user, BindingResult bind){
        ModelAndView view = new ModelAndView();
        if(!bind.hasErrors()){
            Set<Role> roles = userService.findByUsername(user.getUsername()).getRoles();
            if(new ArrayList<Role>(roles).get(0).getRole().equals("CLIENT")){
                view.setViewName("redirect:/client");
            }
            userService.saveOrUpdate(user);
            user.setRoles(roles);
            userService.saveOrUpdate(user);
        }
        return view;
    }

    @RequestMapping(value = "/courier", method = RequestMethod.GET)
    public ModelAndView courier(){
        ModelAndView view = new ModelAndView();
        view.setViewName("courier");
        return view;
    }

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public ModelAndView sender(){
        ModelAndView view = new ModelAndView();
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        view.addObject("user", userService.findByUsername(username));
        view.setViewName("client");
        return view;
    }
}
