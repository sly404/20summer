package com.manager.login.Service;



import com.manager.login.Entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DishService {
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
     * @description: 添加菜品
     * @param  dish_name
     * @param  dish_price
     * @param  discount
     * @param  discription
     * @param  type
     * @param  quantity
     * @param  state
     * @param  picture
     * @return
     */
    boolean insertdish(String dish_name,float dish_price,float discount,String discription,String type,int quantity,int state,String picture);

    /**
     *
     * @description: 更新菜品
     * @param  dish_id
     * @param  dish_name
     * @param  dish_price
     * @param  discount
     * @param  description
     * @param  type
     * @param  quantity
     * @param  state
     * @param  picture
     * @return
     */
    boolean updatedish_byid(int dish_id,String dish_name,float dish_price,float discount,String description,String type,int quantity,int state,String picture);

    /**
     *
     * @description: 删除菜品
     * @param  dish_id
     * @return
     */
    boolean delete_dish(int dish_id);
}
