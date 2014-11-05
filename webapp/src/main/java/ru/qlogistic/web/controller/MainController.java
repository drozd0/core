package ru.qlogistic.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView root(){
        ModelAndView view = new ModelAndView();
        view.setViewName("redirect:login");
        return view;
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView main(){
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }

    @RequestMapping(value = "/courier", method = RequestMethod.GET)
    public ModelAndView courier(){
        ModelAndView view = new ModelAndView();
        view.setViewName("courier");
        return view;
    }

    @RequestMapping(value = "/sender", method = RequestMethod.GET)
    public ModelAndView sender(){
        ModelAndView view = new ModelAndView();
        view.setViewName("sender");
        return view;
    }

    @RequestMapping(value = "/receiver", method = RequestMethod.GET)
    public ModelAndView receiver(){
        ModelAndView view = new ModelAndView();
        view.setViewName("receiver");
        return view;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView view = new ModelAndView();
        view.setViewName("login");
        return view;
    }

    @RequestMapping(value = "/registrate", method = RequestMethod.GET)
    public ModelAndView registrate(){
        ModelAndView view = new ModelAndView();
        view.setViewName("create_user");
        return view;
    }
}