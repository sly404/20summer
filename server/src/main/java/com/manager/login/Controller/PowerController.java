package com.manager.login.Controller;


import com.manager.login.Entity.Power;
import com.manager.login.ServiesImpl.PowerServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PowerController {
    @Autowired
    private PowerServiceimp powerService;
    @RequestMapping(value = "/getpower")
    public List<Power> getEmployers(){
        return  powerService.getPower();
    }
    @RequestMapping(value = "/setpowerbyid")
    public int setPowerById(@RequestParam("id")int id,@RequestParam("power")String power){
        return powerService.setPowerById(id,power);
    }

}
