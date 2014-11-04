package ru.qlogistic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/add")
    public void saveOrUpdateUser(User user, BindingResult bind){
        if(!bind.hasErrors()){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userService.saveOrUpdate(user);
        }
    }
}
