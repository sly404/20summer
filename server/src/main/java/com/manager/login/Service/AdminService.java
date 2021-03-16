package com.manager.login.Service;

import com.manager.login.Entity.Admin;
import com.manager.login.Entity.AdminBrief;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<AdminBrief> getAdminBrief();
    List<Admin> getAdmin(int id);
    int newAdmin(Admin admin);
    int deleteAdmin(int id);
    int updateAdminById(int id,int admin_type,String name,String real_name,String phone,String password,String sex,String birthday,String build_time,String state,String note);
    List<AdminBrief> getAdminBriefByPage(int pageNo,int pageSize);
    int getCount();
    int adminLogin(String username,String password);
    int adminLoginPhone(String phone,String password);
}
