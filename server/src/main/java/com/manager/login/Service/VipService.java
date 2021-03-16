package com.manager.login.Service;

import com.manager.login.Entity.vip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VipService {
    List<vip> getVip();
    int deleteVip(String username);
}
