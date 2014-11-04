package ru.qlogistic.logic.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.qlogistic.logic.model.User;

public interface UserService extends UserDetailsService{
    void saveOrUpdate(final User user);
    User findById(Long id);
    User loadUserByUsername(String email);
}
