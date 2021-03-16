package com.manager.login.Mapper;


import com.manager.login.Entity.Dish;
import com.manager.login.Entity.Dish_ordered;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DishMapper {
    boolean deleteDish_ordered(@Param("order_id") int order_id,@Param("dish_id")int dish_id);
    boolean insertDish_ordered(@Param("dish_ordered")Dish_ordered dish_ordered);
    List<Dish_ordered> selectOrderedDish(@Param("order_id")int order_id);
    List<Dish_ordered> selectOrderedDishbyState(@Param("state") int state,@Param("offset") int offset,@Param("pagesize") int pagesize);
    Dish selectDish_byID(@Param("dish_id") int dish_id);
    List<Dish> showDish_All(@Param("offset") int offset, @Param("pagesize") int pagesize);
    boolean insertDish(Dish dish);
    boolean updateDish(Dish dish);
    boolean updateDish_ordered(Dish_ordered dish_ordered);
    boolean delete_dish(int dish_id);

}
