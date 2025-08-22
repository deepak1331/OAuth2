package com.learn.OAuth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String greet(){
        return "Welcome to SpringBoot OAuth2 demo !";
    }
}
