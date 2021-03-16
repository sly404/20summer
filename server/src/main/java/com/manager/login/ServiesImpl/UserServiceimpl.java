package com.manager.login.ServiesImpl;


import com.manager.login.Entity.User;
import com.manager.login.Mapper.UserMapper;
import com.manager.login.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Repository
public class UserServiceimpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean login(String user_name, String user_pwd) {
        User user=new User();
        user=userMapper.SelectByName(user_name);
        if(user.getUser_password()==user_pwd){
            return true;
        }
        else {return false;}
    }

    @Override
    public boolean register(String user_name, String user_pwd, String user_phone, String user_birthday, String user_sex,String user_note) {
        User user=new User();
        user=userMapper.SelectByName(user_name);
        if (user.getUser_name()!=null){
            user.setUser_name(user_name);
            user.setUser_password(user_pwd);
            user.setUser_phone(user_phone);
            user.setUser_birthday(user_birthday);
            user.setUser_sex(user_sex);
            Date date = new Date();
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String user_buildtime = format.format(date);
            user.setUser_buildtime(user_buildtime);
            int user_state=0;
            user.setUser_state(user_state);
            user.setUser_picture(null);
            userMapper.insert(user);
            return true;
        }
        else return false;
    }
}
