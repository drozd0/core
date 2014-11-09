package ru.qlogistic.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;

public abstract class AuthorizedController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @ModelAttribute("user")
    public User getCurrentUser(Authentication authentication){
        return authentication != null? userService.findByUsername(authentication.getName()) : null;
    }
}
