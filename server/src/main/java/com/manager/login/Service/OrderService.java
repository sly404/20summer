package com.manager.login.Service;



import com.manager.login.Entity.Dish;
import com.manager.login.Entity.Dish_ordered;
import com.manager.login.Entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderService {

    /**
     *
     * @description: 创建订单返回订单号
     * @param user_id
     * @param table_id
     * @return
     */
    int createOrder(int user_id,int table_id);

    /**
     *
     * @description: 根据订单号添加菜品
     * @param order_id
     * @param dish_id
     * @param dish_num
     * @return
     */
    boolean insertDishbyid(int order_id,int dish_id,int dish_num);

    /**
     *
     * @description: 根据订单号删除菜品
     * @param  order_id
     * @param  dish_id
     * @return
     */
    boolean deleteDishbyid(int order_id,int dish_id);

    /**
     *
     * @description: 分页显示菜品列表
     * @param  pagenum
     * @param  pagesize
     * @return
     */
    List<Dish> ShowDishlist(int pagenum, int pagesize);

    /**
     *
     * @description: 根据状态显示订单
     * @param  pagenum
     * @param  pagesize
     * @param  state
     * @return
     */
    List<Order> ShowOrderByState(int state, int pagenum, int pagesize);

    /**
     *
     * @description: 根据状态显示菜单
     * @param  pagenum
     * @param  pagesize
     * @param  state
     * @return
     */
    List<Dish_ordered> ShowDish_orderedByState(int state, int pagenum, int pagesize);

    /**
     *
     * @description: 计算总价
     *      * @param  order_id
     *      * @return
     */
    Order Show_totalPrice(int order_id,int user_id);

    /**
     *
     * @description: 显示订单内菜品
     * @param  order_id
     * @return
     */
    List<Dish_ordered> ShowOrderedDish(int order_id);

    /**
     *
     * @description:更新订单内菜品信息
     * @param  order_id
     * @param   dish_id
     * @param  dish_num
     * @param   dish_state
     * @param   note
     * @return
     */
    boolean UpdateDish_Ordered(int order_id,int dish_id,int dish_num,int dish_state,String note);

    /**
     *
     * @description:更新订单
     * @param  order_id
     * @param order_state
     * @param order_discount
     * @return
     */
    boolean UpdateOrder(int order_id,int order_state,float order_discount,String note);

    /**
     *
     * @description:根据id获取order
     * @param  order_id
     * @return
     */
    Order getOrderById(int order_id);
}
