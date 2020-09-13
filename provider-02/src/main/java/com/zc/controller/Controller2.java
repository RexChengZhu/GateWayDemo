package com.zc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/future")
public class Controller2 {

    @GetMapping("/test888")
    public String test(){
        return "provider-02-future";
    }
}
