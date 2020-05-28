package com.example.wechattest.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="wechat") //接收application.yml中的myProps下面的属性
public class MyProps {
    public String accessTokenUrl;

    public String appid;

    public String appsecret;

    public String createMenuUrl;

    public String getMenuUrl;

    public String menu;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    public void setAccessTokenUrl(String accessTokenUrl) {
        this.accessTokenUrl = accessTokenUrl;
    }

    public String getCreateMenuUrl() {
        return createMenuUrl;
    }

    public void setCreateMenuUrl(String createMenuUrl) {
        this.createMenuUrl = createMenuUrl;
    }

    public String getGetMenuUrl() {
        return getMenuUrl;
    }

    public void setGetMenuUrl(String getMenuUrl) {
        this.getMenuUrl = getMenuUrl;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
