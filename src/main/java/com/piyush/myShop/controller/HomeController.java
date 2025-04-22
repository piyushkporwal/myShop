package com.piyush.myShop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        System.out.println("greet is running...");
        return "Welcome to My Shop!";
    }

    @RequestMapping("/about")
    public String aboutSection(){
        return "Hey!! You want to know about us??";
    }
}
