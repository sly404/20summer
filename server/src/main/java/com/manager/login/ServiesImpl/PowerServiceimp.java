package com.manager.login.ServiesImpl;

import com.manager.login.Entity.Power;
import com.manager.login.Mapper.PowerMapper;
import com.manager.login.Service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PowerServiceimp implements PowerService {
    @Autowired
    PowerMapper powerMapper;
    @Override
    public List<Power> getPower() {
        try {
            return powerMapper.getPower();
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public int setPowerById(int id,String power) {
        try {
            return powerMapper.setPowerById(id,power);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
