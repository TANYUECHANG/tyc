package com.lw.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value("${server.port}")
    private String  port ;
    @GetMapping("hello")
    public  String sayHello(){
        return "hello";
    }
}
