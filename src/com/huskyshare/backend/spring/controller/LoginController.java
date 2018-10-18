package com.huskyshare.backend.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("login")
    public ModelAndView login() {
        System.out.println("Loging in");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/WEB-INF/view/login.jsp");
        return mav;
    }
}
