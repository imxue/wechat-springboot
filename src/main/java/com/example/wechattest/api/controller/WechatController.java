package com.example.wechattest.api.controller;

import com.example.wechattest.DataModel.WechatToken;
import com.example.wechattest.api.service.WechatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/wechat")
public class WechatController {


    @Autowired
    WechatService wechatService;
    //验证微信服务
    @RequestMapping(value = {"/check"},method = {RequestMethod.GET})
    public String check(@RequestParam("echostr") String echostr){
        return echostr;
    }

    //获取微信accesstoken
    @RequestMapping(value = {"/getAccessToken"},method = {RequestMethod.GET})
    public List<WechatToken> getAccesstoken(){
        List<WechatToken> result = null;
        result = wechatService.getAccessToken();

        return result;
    }

}
