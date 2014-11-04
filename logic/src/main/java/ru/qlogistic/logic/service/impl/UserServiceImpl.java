package ru.qlogistic.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.qlogistic.logic.dao.UserDao;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveOrUpdate(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User loadUserByUsername(String email) throws UsernameNotFoundException {
        return userDao.findByUsername(email);
    }
}
