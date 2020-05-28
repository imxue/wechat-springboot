package com.example.wechattest.api.service.impl;


import com.example.wechattest.DataModel.WechatToken;
import com.example.wechattest.Mapper.WechatMapper;
import com.example.wechattest.api.service.WechatService;
import com.example.wechattest.config.LogConfig;
import com.example.wechattest.util.MyProps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class WechatServiceImpl implements WechatService {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    @Autowired
    WechatMapper wechatMapper;
    @Autowired
    MyProps myProps;
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<WechatToken> getAccessToken(){
        List<WechatToken> result = wechatMapper.getWechatToken();
        long nowTime = System.currentTimeMillis();
        LOG.info("获取accesstoken");
        LOG.info(result.toString());
        if(result!=null){
            if(result.get(0)!=null){
                long time = result.get(0).getTime();
                if((nowTime-time)/1000>7200){
                    WechatToken wechatToken = this.updateAccessToken();
                    result.add(wechatToken);
                }
            }

        }else{
            WechatToken wechatToken = this.insertAccessToken();
            result.add(wechatToken);
        }
        return result;
    }
    @Override
    public WechatToken getAccessTokenFromWechat(){
        String url =myProps.getAccessTokenUrl()+
                "?grant_type=client_credential&appid="+
                myProps.getAppid()+
                "&secret="+myProps.getAppsecret();
        ResponseEntity<WechatToken> responseEntity = restTemplate.getForEntity(url, WechatToken.class);
        long time = System.currentTimeMillis();
        WechatToken wechatToken = responseEntity.getBody();
        wechatToken.setTime(time);
        System.out.println(responseEntity.getBody().toString());
        return wechatToken;
    }
    @Override
    public WechatToken insertAccessToken(){
        WechatToken wechatToken = this.getAccessTokenFromWechat();
        String access_token = wechatToken.getAccess_token();
        long time = System.currentTimeMillis();
        wechatMapper.insertWechatToken(access_token,time);
        return wechatToken;
    }
    @Override
    public WechatToken updateAccessToken(){
        WechatToken wechatToken = this.getAccessTokenFromWechat();
        String access_token = wechatToken.getAccess_token();
        long time = System.currentTimeMillis();
        wechatMapper.updateWechatToken(access_token,time);
        return wechatToken;
    }
}
