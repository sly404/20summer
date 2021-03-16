package com.manager.login.Controller;


import com.manager.login.Entity.Dish;
import com.manager.login.Service.DishService;
import com.manager.login.ServiesImpl.DishServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    DishServiceimpl dishService;

    @GetMapping(value="/getDishlist")
    public List<Dish> get_Dish_list(@RequestParam int page_num, @RequestParam int page_size) {
        return dishService.ShowDishlist(page_num, page_size);
    }

    @PostMapping(value="/insertDish")
    public boolean insert_Dish(@RequestParam String dish_name,
                               @RequestParam float dish_price,
                               @RequestParam float discount,
                               @RequestParam String discription,
                               @RequestParam String type,
                               @RequestParam int quantity,
                               @RequestParam int state,
                               @RequestParam String picture){
        return dishService.insertdish(dish_name,dish_price,discount,discription,type,quantity,state,picture);
    }

    @PostMapping(value="/UpdateDish")
    public boolean updateDish(@RequestParam int dish_id,
                              @RequestParam String dish_name,
                              @RequestParam float dish_price,
                              @RequestParam float discount,
                              @RequestParam String discription,
                              @RequestParam String type,
                              @RequestParam int quantity,
                              @RequestParam int state,
                              @RequestParam String picture
    ){
        return dishService.updatedish_byid(dish_id,dish_name,dish_price,discount,discription,type,quantity,state,picture);
    }

    @PostMapping(value="delete_dish")
    public boolean delete_dish(@RequestParam int dish_id){
        return dishService.delete_dish(dish_id);
    }

    @GetMapping(value="gettest")
    public List<Dish> gettest() {
        return dishService.ShowDishlist(1,1);
    }
}
