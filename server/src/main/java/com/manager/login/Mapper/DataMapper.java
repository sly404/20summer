package com.manager.login.Mapper;

import com.manager.login.Entity.Data;
import com.manager.login.Entity.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface DataMapper {
    @Select("select order_id,settlement_time,user_id,total_price from test1.order")
    List<Data> getAllOrder();

    @Select("select order_id,settlement_time,user_id,total_price from test1.order where date(settlement_time) between #{begintime} and #{endtime}")
    List<Data> getDayOrderBetween(@Param("begintime")String begintime, @Param("endtime")String endtime);

    @Select("select * from test1.order where date(settlement_time) between #{begintime} and #{endtime}")
    List<Order> getOrderBetween(@Param("begintime")String begintime, @Param("endtime")String endtime);

    @Select("select order_id,settlement_time,user_id,total_price from test1.order where month(settlement_time) between #{begintime} and #{endtime}")
    List<Data> getMonthOrderBetween(@Param("begintime")String begintime, @Param("endtime")String endtime);

    @Select("select order_id,settlement_time,user_id,total_price from test1.order where year(settlement_time) between #{begintime} and #{endtime}")
    List<Data> getYearOrderBetween(@Param("begintime")String begintime, @Param("endtime")String endtime);

    @Select("select order_id,settlement_time,user_id,total_price from test1.order where settlement_time between #{begintime} and #{endtime}")
    List<Data> getDetailOrderBetween(@Param("begintime")String begintime, @Param("endtime")String endtime);

    @Select("select order_id,settlement_time,user_id,total_price from test1.order where date(settlement_date)=#{date}")
    List<Data> getTodayOrder(@Param("date")String date);

    @Select("select count(*) from test1.order where state = #{state}")
    int getstateCount(@Param("state")int state);
}
