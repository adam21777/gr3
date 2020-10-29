package com.sda.zd18.gr3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value={",","/index"}, method= RequestMethod.GET)
    public String index(Model model){

        String message = "hello Spring boot";
        model.addAttribute("message",message);
        return "index";
    }

    @RequestMapping(value={",","/userRegister"}, method= RequestMethod.GET)
    public String userRegister(Model model){

        String message = "hello Spring boot";
        model.addAttribute("message",message);
        return "index";
    }
}
