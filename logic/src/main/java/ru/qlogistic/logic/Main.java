package ru.qlogistic.logic;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.qlogistic.logic.dao.OrderDao;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/context.xml");
        UserService userService = (UserService) context.getBean("userService");
        User mike = userService.loadUserByUsername("Mike");

        User john = userService.loadUserByUsername("John");
        User gery = userService.loadUserByUsername("Gery");
        System.out.println(mike);
        System.out.println(john);
        System.out.println(gery);

        /*CourierDao courierDao = (CourierDao) context.getBean("courierDao");
        CustomerDao customerDao = (CustomerDao) context.getBean("senderDao");
        OrderDao orderDao =(OrderDao) context.getBean("orderDao");

        Customer cus = customerDao.findUserByUsername("Mike");
        System.out.println(cus);
        Customer cus1 = customerDao.findUserByUsername("John");
        System.out.println(cus1);
        Customer cus2 = customerDao.findUserByUsername("Gery");
        System.out.println(cus2);
        System.out.println("CHECK!!!");
        System.out.println(orderDao.findOrdersBySenderId(1L));
        System.out.println(orderDao.findOrdersBySenderId(2L));
        System.out.println(orderDao.findOrdersBySenderId(3L));
        System.out.println("OK");*/


    }
}
