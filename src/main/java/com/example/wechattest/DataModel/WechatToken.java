package com.example.wechattest.DataModel;

public class WechatToken {
    public String access_token;
    public long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    @Override
    public String toString() {
        return "WechatToken{" +
                "access_token='" + access_token + '\'' +
                ", time=" + time +
                '}';
    }
}
