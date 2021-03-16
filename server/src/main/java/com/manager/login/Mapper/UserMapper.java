package com.manager.login.Mapper;

import com.manager.login.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    boolean insert(User user);
    User SelectByName(String name);
    boolean Update(User user);
    User SelectByID(int user_id);

}
