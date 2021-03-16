package com.manager.login.Mapper;

import com.manager.login.Entity.User;
import com.manager.login.Entity.vip;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface VIPMapper {
    @Select("select user_name,phone,state from user")
    List<vip> getVip();
    @Delete("Delete from user where user_name=#{username}")
    int deleteVip(@Param("username")String username);
    @Select("select * from user")
    List<User> getallUser();
    @Select("Select count(*) from user")
    int getCount();
    @Update("update user set user_name=#{user_name},password=#{password},phone=#{phone},sex=#{sex},birthday=#{birthday},state=#{state},picture=#{picture},note=#{note} where user_id=#{user_id}")
    int updateUserByid(@Param("user_id")int user_id,@Param("user_name")String username,@Param("password")String password,@Param("phone")String phone,@Param("sex")String sex,@Param("birthday")String birthday,@Param("state")int state,@Param("picture")String picture,@Param("note")String note);
}
