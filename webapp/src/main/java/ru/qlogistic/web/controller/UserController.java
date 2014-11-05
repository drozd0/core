package ru.qlogistic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.qlogistic.logic.model.Role;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.RoleService;
import ru.qlogistic.logic.service.UserService;
import ru.qlogistic.web.form.UserRegistrationForm;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/add")
    public ModelAndView saveOrUpdateUser(UserRegistrationForm userForm, BindingResult bind){
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
    }
}
