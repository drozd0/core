package ru.qlogistic.logic.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.qlogistic.logic.dao.UserDao;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.model.repository.UserRepository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveAndFlush(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findOne(id);
    }
}
