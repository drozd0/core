package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.User;

public interface UserDao {
    void saveAndFlush(User user);
    User findById(Long id);
    User findByUsername(String username);
}
