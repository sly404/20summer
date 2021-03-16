package com.manager.login.Controller;

import com.manager.login.Entity.User;
import com.manager.login.Entity.UserLogin;
import com.manager.login.ServiesImpl.UserLoginServerimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserLoginController {
    @Autowired
    private UserLoginServerimp userLoginServer;
    @RequestMapping(value = "/userlogin",method = RequestMethod.POST,consumes="application/json")
    @ResponseBody
    public String Login(@RequestBody User user){
        String username = user.getUser_name();
        String password = user.getUser_password();
        System.out.println(username+password);
        List<UserLogin> users = userLoginServer.getUser(username);
        UserLogin userLogin = users.get(0);
        String result = "result";
        if(password.toString().equals(userLogin.getPassword().toString())){
            return "{\""+result+"\":\"Success\"}";
        }
        else{
            return "{\""+result+"\":\"Fail\"}";
        }
    }
    @RequestMapping(value = "login",method = RequestMethod.POST,consumes="application/json")
    @ResponseBody
    public String Log(@RequestBody User user){
        return "";
    }
}
