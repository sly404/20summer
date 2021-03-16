package com.manager.login.Controller;
import com.manager.login.Service.UserService;
import com.manager.login.ServiesImpl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserServiceimpl userService;


    @PostMapping(value="/user_login")
    public boolean userlogin(@RequestParam String username,@RequestParam String userpwd){return userService.login(username,userpwd);}

    @PostMapping(value="/Admin_login")
    public boolean Adminlogin(@RequestParam String Admin_name,@RequestParam String Admin_pwd){return userService.login(Admin_name,Admin_pwd);}

    @PostMapping(value="/register")
    public boolean userregieter(@RequestParam String username,
                                @RequestParam String userpwd,
                                @RequestParam String phone,
                                @RequestParam String birthday,
                                @RequestParam String sex,
                                @RequestParam String note){return userService.register(username,userpwd,phone,birthday,sex,note);}

    @RequestMapping("/a")
    public String test() {
        return "test.html";
    }
}
