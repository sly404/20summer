package com.manager.login.Controller;

import com.manager.login.Entity.vip;
import com.manager.login.ServiesImpl.VipServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VipController {
    @Autowired
    VipServiceimp vipService;
    @RequestMapping("/getvip")
    public List<vip> getVip(){
        return vipService.getVip();
    }
    @RequestMapping("/deletevip")
    public int deletevip(@RequestParam("username") String username){
        return  vipService.deleteVip(username);
    }

}
