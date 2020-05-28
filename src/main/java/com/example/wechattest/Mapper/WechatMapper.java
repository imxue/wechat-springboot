package com.example.wechattest.Mapper;

import com.example.wechattest.DataModel.User;
import com.example.wechattest.DataModel.WechatToken;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface WechatMapper {
    @Select("select access_token,time from wechattoken")
    List<WechatToken> getWechatToken();

    @Results({
            @Result(property = "access_token", column = "access_token"),
            @Result(property = "time", column = "time"),
    })

    @Insert("insert wechattoken (access_token,time) value (#{access_token},#{time})")
    Integer insertWechatToken(String accesstoken,long time);

    @Update("update wechattoken set access_token=#{access_token},time=#{time} where id=0")
    Integer updateWechatToken(String accesstoken,long time);

}
