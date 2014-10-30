package ru.qlogistic.logic;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.qlogistic.logic.dao.UserDao;
import ru.qlogistic.logic.model.User;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/context.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        User u= new User();
        u.setUsername("John");
        userDao.saveAndFlush(u);
        System.out.println(userDao.findUserById(1L));
    }
}
