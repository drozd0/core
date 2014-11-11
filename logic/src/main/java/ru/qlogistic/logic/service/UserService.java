package ru.qlogistic.logic.service;

import ru.qlogistic.logic.model.User;

public interface UserService{
    void saveOrUpdate(final User user);
    User findById(Long id);
    User findByUsername(String email);
    User getCurrentUser();
}
