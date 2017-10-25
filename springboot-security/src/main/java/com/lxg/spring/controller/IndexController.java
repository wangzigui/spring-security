package com.lxg.spring.controller;

import com.lxg.spring.service.SUserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IndexController {

    @Resource
    private SUserService sUserService;

    @RequestMapping("/home")
    public String home() {
        return "home";

    }


    @PreAuthorize("hasRole('admin')")
    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String toAdmin(){
        return "helloAdmin";
    }
    
    @PreAuthorize("hasRole('admin')")
    @RequestMapping(value = "/hellouser",method = RequestMethod.GET)
    public String toUser(){
        return "helloUser";
    }

    @RequestMapping("/hello")
    public String hello() {

        return "hello";

    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/")
    public String root() {
        return "index";

    }

    @RequestMapping("/403")
    public String error(){
        return "403";
    }
}
