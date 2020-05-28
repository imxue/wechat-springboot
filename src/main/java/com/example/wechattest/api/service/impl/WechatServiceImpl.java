package com.example.wechattest.api.service.impl;


import com.example.wechattest.DataModel.WechatToken;
import com.example.wechattest.Mapper.WechatMapper;
import com.example.wechattest.api.service.WechatService;
import com.example.wechattest.util.MyProps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class WechatServiceImpl implements WechatService {
    @Autowired
    WechatMapper wechatMapper;
    @Autowired
    MyProps myProps;
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<WechatToken> getAccessToken(){
        List<WechatToken> result = wechatMapper.getWechatToken();
        return result;
    }
    @Override
    public WechatToken getAccessTokenFromWechat(){
        String url =myProps.getAccessTokenUrl()+
                "?grant_type=client_credential&appid="+
                myProps.getAppid()+
                "&secret="+myProps.getAppsecret();
        ResponseEntity<WechatToken> responseEntity = restTemplate.getForEntity(url, WechatToken.class);
        System.out.println(responseEntity.getBody().toString());
        long time = System.currentTimeMillis();
        WechatToken wechatToken = responseEntity.getBody();
        wechatToken.setTime(time);
        return wechatToken;
    }
    @Override
    public String insertAccessToken(){
        WechatToken wechatToken = this.getAccessTokenFromWechat();
        String access_token = wechatToken.getAccess_token();
        long time = System.currentTimeMillis();
        wechatMapper.insertWechatToken(access_token,time);
        return "insert success";
    }
    @Override
    public String updateAccessToken(){
        WechatToken wechatToken = this.getAccessTokenFromWechat();
        String access_token = wechatToken.getAccess_token();
        long time = System.currentTimeMillis();
        wechatMapper.updateWechatToken(access_token,time);
        return "update success";
    }
}
