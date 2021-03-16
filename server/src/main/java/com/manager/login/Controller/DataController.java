package com.manager.login.Controller;

import com.manager.login.Entity.Data;
import com.manager.login.Entity.Order;
import com.manager.login.ServiesImpl.DataServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin
public class DataController {
    @Autowired
    DataServiceimp orderService;
    @RequestMapping(value = "/getallorder")
    public List<Data> getAllOrder(){
        return orderService.getAllOrder();
    }

    @RequestMapping(value = "/getorderbetween")
    public List<Order> getOrderBetween(@RequestParam("begintime")String begintime, @RequestParam("endtime")String endtime)
    {
        return orderService.getOrderBetween(begintime,endtime);
    }

    @RequestMapping(value = "/getdayorderbetween")
    public List<Data> getDayOrderBetween(@RequestParam("begintime")String begintime, @RequestParam("endtime")String endtime){
        return  orderService.getDayOrderBetween(begintime,endtime);
    }

    @RequestMapping(value = "/getmonthorderbetween")
    public List<Data> getMonthOrderBetween(@RequestParam("begintime")String begintime, @RequestParam("endtime")String endtime){
        return  orderService.getMonthOrderBetween(begintime,endtime);
    }

    @RequestMapping(value = "/getyearorderbetween")
    public List<Data> getYearOrderBetween(@RequestParam("begintime")String begintime, @RequestParam("endtime")String endtime){
        return  orderService.getYearOrderBetween(begintime,endtime);
    }

    @RequestMapping(value = "/gettodayorder")
    public List<Data> getTodayOrder(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateToday = date.format(formatter);
        return orderService.getTodayOrder(dateToday);
    }
}
