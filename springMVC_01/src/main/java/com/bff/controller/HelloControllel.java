package com.bff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllel {

    @RequestMapping(value = "/hello")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "succse";
    }
}
