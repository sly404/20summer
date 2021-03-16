package com.manager.login.Controller;

import com.manager.login.Entity.Admin;
import com.manager.login.Entity.AdminBrief;
import com.manager.login.ServiesImpl.AdminServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminServiceimp adminBriedService;
    @RequestMapping(value = "/getadminbrief")
    public List<AdminBrief> getEmployers(){
        List<AdminBrief> adminBriefList = adminBriedService.getAdminBrief();

        if(adminBriefList!=null){
            return  adminBriefList;
        }
        else{
            List<AdminBrief>  defult = new ArrayList<>();
            AdminBrief adminBrief = new AdminBrief();
            adminBrief.setAdmin_id(-1);
            defult.add(adminBrief);
            return defult;
        }
    }
    @RequestMapping(value = "/getadminbriefbypage")
    public List<AdminBrief> getAdminBriefByPage(@RequestParam(value = "pageNO")int pageNo,@RequestParam(value = "pageSize")int pageSize){
        System.out.println(pageNo+pageSize);
        return  adminBriedService.getAdminBriefByPage(pageNo,pageSize);
    }
    @RequestMapping(value = "/getadminbyid")
    public List<Admin> getAdmin(@RequestParam(value = "admin_id")int id){
        List<Admin> admins = adminBriedService.getAdmin(id);
        System.out.println(admins.get(0).getUser_name());
        return  admins;
    }
    @RequestMapping(value="/deleteadminbyid")
    public int deleteAdmin(@RequestParam(value = "admin_id") int id){
        return  adminBriedService.deleteAdmin(id);
    }
    @RequestMapping(value="/newadmin")
    public int newadmin(@RequestBody Admin admin){
        return  adminBriedService.newAdmin(admin);
    }
    @RequestMapping(value = "/updateadminbyid")
    public int updateadmin(@RequestBody Admin admin){
        int result = adminBriedService.updateAdminById(admin.getAdmin_id(),admin.getAdmin_type(),admin.getUser_name(),admin.getReal_name(),admin.getPhone(),admin.getPassword(),admin.getSex(),admin.getBirthday(),admin.getBuild_time(),admin.getState(),admin.getState());
        return result;
    }
    @RequestMapping(value = "getadmincount")
    public int getAdminCount(){
        return adminBriedService.getCount();
    }
    @RequestMapping(value = "adminloginbyusername")
    public String adminLoginByUserName(@RequestParam("username")String username,@RequestParam("password")String password){
        int type = adminBriedService.adminLogin(username,password);
        return "{\""+"admin_type"+"\":\""+type+"\"}";
    }
    @RequestMapping(value = "adminloginbyphone")
    public String adminLoginByPhone(@RequestParam("phone")String phone,@RequestParam("password")String password){
        int type = adminBriedService.adminLoginPhone(phone,password);
        return "{\""+"admin_type"+"\":\""+type+"\"}";
    }
}
