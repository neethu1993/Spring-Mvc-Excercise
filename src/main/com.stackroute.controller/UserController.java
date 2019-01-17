package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    User user1 = new User();

    @RequestMapping(value = "/")
    public String greeting1(ModelMap map){

        map.addAttribute("greeting1",user1.getName());
        return "index";
    }
}

