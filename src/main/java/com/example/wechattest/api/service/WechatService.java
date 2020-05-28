package com.example.wechattest.api.service;

import com.example.wechattest.DataModel.WechatToken;

import java.util.List;

public interface WechatService {
    /***
     * 获取微信accesstoken
     * @return
     */
    List<WechatToken> getAccessToken();
    /***
     * 获取微信accesstoken
     * @return
     */
    WechatToken getAccessTokenFromWechat();
    /***
     * 添加微信accesstoken
     *
     * @return
     */
    WechatToken insertAccessToken();
    /***
     * 更新微信accesstoken
     *
     * @return
     */
    WechatToken updateAccessToken();

}
