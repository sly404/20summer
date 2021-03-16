package com.manager.login.ServiesImpl;

import com.manager.login.Entity.vip;
import com.manager.login.Mapper.VIPMapper;
import com.manager.login.Service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VipServiceimp implements VipService {
    @Autowired
    VIPMapper vipMapper;
    @Override
    public List<vip> getVip() {
        try {
            return vipMapper.getVip();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public int deleteVip(String username) {
        try {
            return vipMapper.deleteVip(username);
        }catch (Exception e){
            throw e;
         }
    }
}
