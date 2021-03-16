package com.manager.login.Service;

import com.manager.login.Entity.Power;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PowerService{
    List<Power> getPower();
    int setPowerById(int id,String power);
}
