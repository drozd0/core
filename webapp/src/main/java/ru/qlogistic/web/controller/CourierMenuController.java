package ru.qlogistic.web.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.qlogistic.web.util.MenuEntry;

import java.util.List;

public class CourierMenuController extends AuthorizedController  implements ApplicationContextAware{
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @ModelAttribute("menu")
    private List<MenuEntry> getCmsMenu(){
        List<MenuEntry> menu = context.getBean("courierMenu", List.class);
        return menu;
    }
}
