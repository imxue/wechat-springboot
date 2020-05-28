package com.example.wechattest.DataModel;

public class WechatToken {
    public String accesstoken;
    public long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    @Override
    public String toString() {
        return "WechatToken{" +
                "accesstoken='" + accesstoken + '\'' +
                ", time=" + time +
                '}';
    }
}
