package ru.qlogistic.logic.ordertest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.qlogistic.logic.dao.UserDao;

public class OrderTest {
    @Test
    public void addOrderTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/dataSource.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");

        /*User sender= new User();
        sender.setUsername("John");
        userDao.saveAndFlush(sender);

        User receiver= new User();
        receiver.setUsername("Bob");
        userDao.saveAndFlush(receiver);

        User courier= new User();
        courier.setUsername("Barak");
        userDao.saveAndFlush(courier);

        Order order = new Order();
        order.setSender(sender);
        order.setSender_id(sender.getId());

        order.setReceiver(receiver);
        order.setReceiver_id(receiver.getId());

        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.saveAndFlush(order);

        System.out.println(order);*/
    }
}
