package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/spring")
public class LoginContorller {

    @RequestMapping(value = "/login")
    String login(){
        System.out.println("login success");
        return "index";
    }

    @RequestMapping("/dome")
    String doSome(){
        System.out.println("write some thing");
        return "/loginout";
    }

    @RequestMapping("/loginOut")
    String loginOut(){
        System.out.println("login out");
        return "login out";
    }


}
