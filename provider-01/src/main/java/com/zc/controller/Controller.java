package com.zc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/hahaha")
public class Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test01")
    public String test(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String header = request.getHeader("hshsd");
        System.out.println(header);
        return "provider01------"+port;
    }

    @PostMapping("/test02")
    public String test2(@RequestBody Map map){
        System.out.println(map);
        return "provider01------"+port;
    }
}
