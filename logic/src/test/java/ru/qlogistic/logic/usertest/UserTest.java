package ru.qlogistic.logic.usertest;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.qlogistic.logic.dao.UserDao;

public class UserTest {

    @Test
    public void addUserTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/dataSource.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        /*User u= new User();
        u.setUsername("John");
        userDao.saveAndFlush(u);
        System.out.println(userDao.findCourierById(1L));*/
    }
}