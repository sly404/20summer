package com.manager.login.Mapper;

import com.manager.login.Entity.Power;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface PowerMapper {
    @Select("select admin_id,real_name,admin_type from admin ")
    List<Power> getPower();
    @Select("select admin_id,real_name,admin_type from admin where admin.user_name=#{username}")
    Power getPowerByid(@Param("username")String username);
    @Update("update admin set admin_type=#{power} where admin_id = #{id}")
    int setPowerById(@Param("id")int id,@Param("power")String power);
}
