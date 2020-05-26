package com.example.wechattest.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/wechat")
public class WechatController {
    @RequestMapping(value = {"/check"},method = {RequestMethod.GET})
    public String check(@RequestParam("echostr") String echostr){
        return echostr;
    }
}
