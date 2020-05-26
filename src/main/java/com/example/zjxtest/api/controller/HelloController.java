package com.example.zjxtest.api.controller;

import com.example.zjxtest.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping(path="/test") // This means URL's start with /demo (after Application path)
public class HelloController {

    @Autowired
    private HelloService helloService;

    private static SimpleDateFormat  sqf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping(value = {"/hello"},method = {RequestMethod.GET})
    public String test(){
        String name = helloService.getName();
        return "hello,there is "+name+"'s place";
    }

}
