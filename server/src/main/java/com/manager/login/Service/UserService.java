package com.manager.login.Service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
/**
 *
 * @description: 用户登陆
 * @param user_name
 * @param user_pwd
 * @return
 */
boolean login(String user_name,String user_pwd);

/**
 *
 * @description: 用户注册
 * @param user_name
 * @param user_pwd
 * @param user_phone
 * @param user_birthday
 * @param user_sex
 * @return
 */
boolean register(String user_name,String user_pwd,String user_phone,String user_birthday,String user_sex,String user_note);
}
