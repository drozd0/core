package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.User;

public interface UserDao {
    void saveAndFlush(User user);
    User findUserById(Long id);
}
