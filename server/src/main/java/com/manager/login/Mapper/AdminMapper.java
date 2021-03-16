package com.manager.login.Mapper;

import com.manager.login.Entity.Admin;
import com.manager.login.Entity.AdminBrief;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface AdminMapper {
    @Select("select admin_id,real_name,sex,birthday,note,admin_type,state from admin")
    List<AdminBrief> getAdminBrief();
    @Select("select * from admin where admin_id=#{id}")
    List<Admin> getAdmin(@Param("id")int id);
    @Select("select * from admin where user_name=#{username}")
    Admin AdminLogin(@Param("username")String username);
    @Select("select * from admin where phone=#{phone}")
    Admin AdminLoginPhone(@Param("phone")String phone);
    @Insert("insert into admin (admin_type,user_name,real_name,phone,password,sex,birthday,build_time,state,note) values(#{admin.admin_id},#{admin.admin_type},#{admin.user_name},#{admin.real_name},#{admin.phone},#{admin.password},#{admin.sex},#{admin.birthday},#{admin.build_time},#{admin.state},#{admin.note})")
    int newAdmin(@Param("admin")Admin admin);
    @Delete("delete from admin where admin_id=#{id}")
    int deleteAdmin(@Param("admin_id")int id);
    @Update("update admin set admin_type=#{admin_type},user_name=#{user_name},real_name=#{real_name},phone=#{phone},password=#{password},sex=#{sex},birthday=#{birthday},build_time=#{build_time},state=#{state},note=#{note} where admin_id =#{id}")
    int updateAdminById(@Param("id")int id,@Param("admin_type")int admin_type,@Param("user_name")String name,@Param("real_name")String real_name,@Param("phone")String phone,@Param("password")String password,@Param("sex")String sex,@Param("birthday")String birthday,@Param("build_time")String build_time,@Param("state")String state,@Param("note")String note);
    @Select("select admin_id,real_name,sex,birthday,note,admin_type,state from admin limit #{pageNO},#{pageSize}")
    List<AdminBrief> getAdminBriefByPage(@Param("pageNO")int pageNo,@Param("pageSize")int pageSize);
    @Select("select count(*) from admin")
    int getCount();
}
