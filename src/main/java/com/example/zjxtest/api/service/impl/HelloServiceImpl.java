package com.example.zjxtest.api.service.impl;

import com.example.zjxtest.api.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getName(){
        String name = "zjx";
        return name;
    }
}
