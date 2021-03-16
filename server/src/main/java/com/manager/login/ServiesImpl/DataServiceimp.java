package com.manager.login.ServiesImpl;

import com.manager.login.Entity.Data;
import com.manager.login.Entity.Order;
import com.manager.login.Mapper.DataMapper;
import com.manager.login.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataServiceimp implements DataService {
    @Autowired
    DataMapper orderMapper;
    @Override
    public List<Data> getAllOrder() {
        try{
            return orderMapper.getAllOrder();
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Order> getOrderBetween(String begintime, String endtime) {
        try{
            return orderMapper.getOrderBetween(begintime,endtime);
        }
        catch(Exception e)
        {
            throw e;
        }
    }

    @Override
    public List<Data> getDayOrderBetween(String begintime, String endtime) {
        try{
            return  orderMapper.getDayOrderBetween(begintime,endtime);
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<Data> getMonthOrderBetween(String begintime, String endtime){
        try{
            return orderMapper.getMonthOrderBetween(begintime,endtime);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public List<Data> getYearOrderBetween(String begintime, String endtime)
    {
        try{
            return orderMapper.getMonthOrderBetween(begintime,endtime);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public List<Data> getDetailOrderBetween(String begintime, String endtime)
    {
        try{
            return orderMapper.getDetailOrderBetween(begintime,endtime);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public List<Data> getTodayOrder(String date) {
        try{
            return orderMapper.getTodayOrder(date);
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public int getstateCount(int state) {
        try{
            return orderMapper.getstateCount(state);
        }catch (Exception e){
            throw e;
        }
    }
}
