package com.manager.login.Service;

import com.manager.login.Entity.UserLogin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserLoginServer {
    List<UserLogin> getUser(String username);
}
