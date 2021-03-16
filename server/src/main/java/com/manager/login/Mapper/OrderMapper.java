package com.manager.login.Mapper;

import com.manager.login.Entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OrderMapper {
    int insert(Order order);
    Order SelectByID(int order_id);
    boolean DeleteByID(int order_id);
    List<Order> SelectByState(@Param("state") int State, @Param("offset") int offset,@Param("pagesize") int pagesize);
    boolean Update(Order order);
}
