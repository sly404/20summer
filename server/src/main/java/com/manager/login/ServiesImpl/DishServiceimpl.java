package com.manager.login.ServiesImpl;


import com.manager.login.Entity.Dish;
import com.manager.login.Mapper.DishMapper;
import com.manager.login.Service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DishServiceimpl implements DishService {
    @Autowired
    DishMapper dishMapper;

    @Override
    public List<Dish> ShowDishlist(int pagenum, int pagesize) {
        int offset=(pagenum-1)*pagesize;
        return dishMapper.showDish_All(offset,pagesize);
    }

    @Override
    public boolean insertdish(String dish_name, float dish_price, float discount, String discription, String type, int quantity, int state, String picture) {
       Dish dish=new Dish();
       dish.setDish_name(dish_name);
       dish.setDish_price(dish_price);
       dish.setDish_discount(discount);
       dish.setDish_description(discription);
       dish.setDish_type(type);
        return false;
    }

    @Override
    public boolean updatedish_byid(int dish_id, String dish_name, float dish_price, float discount, String discription, String type, int quantity, int state, String picture) {
        Dish dish=new Dish();
        dish.setDish_id(dish_id);
        dish.setDish_type(type);
        dish.setDish_name(dish_name);
        dish.setDish_price(dish_price);
        dish.setDish_discount(discount);
        dish.setDish_description(discription);
        dish.setDish_state(state);
        dish.setDish_picture(picture);
        dishMapper.updateDish(dish);
        return false;
    }

    @Override
    public boolean delete_dish(int dish_id) {
      return   dishMapper.delete_dish(dish_id);
    }
}
