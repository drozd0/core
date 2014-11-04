package ru.qlogistic.logic;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/dataSource.xml");
        UserService userService = (UserService) context.getBean("userService");
        User mike = userService.findByUsername("Mike");

        User john = userService.findByUsername("John");
        User gery = userService.findByUsername("Gery");
        System.out.println(mike);
        System.out.println(john);
        System.out.println(gery);
    }
}
