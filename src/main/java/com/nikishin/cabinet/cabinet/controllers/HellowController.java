package com.nikishin.cabinet.cabinet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellowController {
    @RequestMapping("/hello")
    public String  SayHello(){
        return "hello";
    }
}
