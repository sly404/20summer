package com.manager.login.Mapper;

import com.manager.login.Entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserLoginMapper {
    @Select("select user_name,password from admin where user_name = #{username}")
    List<UserLogin> getUser(@Param("username") String username);

}