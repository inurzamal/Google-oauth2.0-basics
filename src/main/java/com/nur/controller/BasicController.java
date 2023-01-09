package com.nur.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class BasicController {

    @GetMapping("/login")
    public String welcome(){
        return "Welcome to Spring Security Oauth2";
    }

    @GetMapping("/user")
    public String home(Principal principal){
        String name = principal.getName();
        return "Welcome " + name + "...";
    }
}
