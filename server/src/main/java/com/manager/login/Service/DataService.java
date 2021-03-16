package com.manager.login.Service;

import com.manager.login.Entity.Data;
import com.manager.login.Entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DataService {

    List<Data> getAllOrder();
    List<Data> getDayOrderBetween(String begintime, String endtime);
    List<Data> getMonthOrderBetween(String begintime, String endtime);
    List<Data> getYearOrderBetween(String begintime, String endtime);
    List<Data> getTodayOrder(String date);
    List<Data> getDetailOrderBetween(String begintime, String endtime);
    List<Order>getOrderBetween(String begintime,String endtime);
    int getstateCount(int state);
}
