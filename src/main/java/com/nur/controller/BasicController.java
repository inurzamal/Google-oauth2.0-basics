package com.nur.controller;

import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

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
        return "Welcome " + name + " ";
    }
}
