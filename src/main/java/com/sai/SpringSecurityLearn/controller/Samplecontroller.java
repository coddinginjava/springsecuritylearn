package com.sai.SpringSecurityLearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Samplecontroller {

    @GetMapping("/hello")
    public String getString(){
        return "Hello after Authentication";
    }
}
