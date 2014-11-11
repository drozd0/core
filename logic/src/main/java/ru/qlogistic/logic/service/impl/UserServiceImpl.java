package ru.qlogistic.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.qlogistic.logic.dao.UserDao;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
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

    @Transactional(rollbackFor = Exception.class)
    public User findByUsername(String email){
        return userDao.findByUsername(email);
    }

    @Override
    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null)
            return findByUsername(authentication.getName());
        return null;
    }


}
