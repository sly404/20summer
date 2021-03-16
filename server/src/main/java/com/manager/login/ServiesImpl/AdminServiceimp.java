package com.manager.login.ServiesImpl;

import com.manager.login.Entity.Admin;
import com.manager.login.Entity.AdminBrief;
import com.manager.login.Mapper.AdminMapper;
import com.manager.login.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminServiceimp implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public List<AdminBrief> getAdminBrief() {
        try {
            return adminMapper.getAdminBrief();
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public List<Admin> getAdmin(int id) {
        try {
            return adminMapper.getAdmin(id);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public int newAdmin(Admin admin) {
        try {
            return adminMapper.newAdmin(admin);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public int deleteAdmin(int id) {
        try {
            return adminMapper.deleteAdmin(id);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public int updateAdminById(int id, int admin_type, String name, String real_name, String phone, String password, String sex, String birthday, String build_time, String state, String note) {
        try {
            return adminMapper.updateAdminById(id,admin_type,name,real_name,phone,password,sex,birthday,build_time,state,note);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public List<AdminBrief> getAdminBriefByPage(int pageNo, int pageSize) {
        try {
            int pg = (pageNo-1)*pageSize;
            return adminMapper.getAdminBriefByPage(pg,pageSize);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public int getCount() {
        try{
            return adminMapper.getCount();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public int adminLogin(String username, String password) {
        Admin admin = adminMapper.AdminLogin(username);
        if(admin!=null&&admin.getPassword().equals(password)){
           return admin.getAdmin_type();
        }
        else return -1;
    }

    @Override
    public int adminLoginPhone(String phone, String password) {
        Admin admin = adminMapper.AdminLoginPhone(phone);
        if(admin!=null&&admin.getPassword().equals(password)){
            return admin.getAdmin_type();
        }
        else return -1;
    }


}
