package ru.qlogistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/add")
    public void saveOrUpdateUser(User user, BindingResult bind){
        if(!bind.hasErrors()){
            userService.saveOrUpdate(user);
        }
    }
}
