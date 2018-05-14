package com.ingxx.controller;

import com.ingxx.model.User;
import com.ingxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.selectByPrimaryKey(1);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
