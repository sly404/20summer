package com.manager.login.ServiesImpl;

import com.manager.login.Entity.UserLogin;
import com.manager.login.Mapper.UserLoginMapper;
import com.manager.login.Service.UserLoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserLoginServerimp implements UserLoginServer {
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Override
    public List<UserLogin> getUser(String username) {
        try {
            List<UserLogin> users = userLoginMapper.getUser(username);
            return  users;
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
