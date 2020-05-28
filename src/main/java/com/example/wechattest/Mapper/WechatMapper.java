package com.example.wechattest.Mapper;

import com.example.wechattest.DataModel.User;
import com.example.wechattest.DataModel.WechatToken;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface WechatMapper {
    @Select("select wechattoken,time from wechattoken")
    List<WechatToken> getWechatToken();

    @Results({
            @Result(property = "accesstoken", column = "id"),
            @Result(property = "time", column = "u"),
    })

    @Insert("insert wechattoken (accesstoken,time) value (#{accesstoken},#{time})")
    Integer insertWechatToken(String accesstoken,long time);

    @Update("update wechattoken set accesstoken=#{accesstoken},time=#{time} where id=0")
    Integer updateWechatToken(String accesstoken,long time);

}
