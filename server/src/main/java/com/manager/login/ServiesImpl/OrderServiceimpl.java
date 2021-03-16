package com.manager.login.ServiesImpl;



import com.manager.login.Entity.Dish;
import com.manager.login.Entity.Dish_ordered;
import com.manager.login.Entity.Order;
import com.manager.login.Entity.User;
import com.manager.login.Mapper.DishMapper;
import com.manager.login.Mapper.OrderMapper;
import com.manager.login.Mapper.UserMapper;
import com.manager.login.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class OrderServiceimpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    DishMapper dishMapper;
    @Autowired
    UserMapper userMapper;


    @Override
    public int createOrder(int user_id, int table_id) {
        Order order=new Order();
        User user=new User();
        user=userMapper.SelectByID(user_id);
        order.setUser_id(user_id);
        order.setTable_id(table_id);
        order.setUser_name(user.getUser_name());
        Timestamp build_time=new Timestamp(System.currentTimeMillis());
        order.setBuild_time(build_time);
        order.setOrder_state(0);
        orderMapper.insert(order);
        return order.getOrder_id();
    }

    @Override
    public boolean insertDishbyid(int order_id,int dish_id,int dish_num){
        Dish_ordered dish_ordered=new Dish_ordered();
        Dish dish=new Dish();
        dishMapper.selectDish_byID(dish_id);
        dish_ordered.setDish_id(dish.getDish_id());
        dish_ordered.setDish_name(dish.getDish_name());
        dish_ordered.setOrder_id(order_id);
        dish_ordered.setDish_state(dish_num);
        dish_ordered.setDish_price(dish.getDish_price()*dish.getDish_discount());
        dishMapper.insertDish_ordered(dish_ordered);
        return true;
    }

    @Override
    public boolean deleteDishbyid(int order_id, int dish_id) {
        dishMapper.deleteDish_ordered(order_id,dish_id);
        return false;
    }

    @Override
    public List<Dish> ShowDishlist(int pagenum, int pagesize) {
        int offset=(pagenum-1)*pagesize;
       return dishMapper.showDish_All(offset,pagesize);
    }

    @Override
    public List<Order> ShowOrderByState(int state, int pagenum, int pagesize) {
        int offset=(pagenum-1)*pagesize;
        return orderMapper.SelectByState(state,offset,pagesize);
    }

    @Override
    public List<Dish_ordered> ShowDish_orderedByState(int state, int pagenum, int pagesize) {
        int offset=(pagenum)*pagesize;
        return dishMapper.selectOrderedDishbyState(state,offset,pagesize);
    }

    @Override
    public Order Show_totalPrice(int order_id, int user_id) {
        Order order=orderMapper.SelectByID(order_id);
        User user=userMapper.SelectByID(user_id);
        if(user.getUser_state()==1){
            order.setOrder_discount(1.00);
        }

        List<Dish_ordered> dish_orderedList=dishMapper.selectOrderedDish(order_id);
        for(int i=0;i<dish_orderedList.size();i++){
            order.setTotal_price(order.getTotal_price()+ dish_orderedList.get(i).getDish_price());
        }
        order.setTotal_price(order.getTotal_price()*order.getOrder_discount());
        orderMapper.Update(order);
        return order;
    }

    @Override
    public List<Dish_ordered> ShowOrderedDish(int order_id) {
        List<Dish_ordered> dish_orderedList=dishMapper.selectOrderedDish(order_id);
        return dish_orderedList;
    }

    @Override
    public boolean UpdateDish_Ordered(int order_id, int dish_id, int dish_num, int dish_state, String note) {
        Dish_ordered dish_ordered=new Dish_ordered();
        dish_ordered.setDish_id(dish_id);
        dish_ordered.setOrder_id(order_id);
        dish_ordered.setDish_num(dish_num);
        dish_ordered.setNote(note);
        dish_ordered.setDish_state(dish_state);
        dishMapper.updateDish_ordered(dish_ordered);
        return true;
    }

    @Override
    public boolean UpdateOrder(int order_id, int order_state, float order_discount,String note) {
        Order order=orderMapper.SelectByID(order_id);
        order.setOrder_state(order_state);
        order.setOrder_discount(order_discount);
        order.setOrder_note(note);
        orderMapper.Update(order);
        return true;
    }

    @Override
    public Order getOrderById(int order_id) {
        Order order = orderMapper.SelectByID(order_id);
        return order;
    }


}
