package com.manager.login.Controller;


import com.manager.login.Entity.Dish;
import com.manager.login.Entity.Dish_ordered;
import com.manager.login.Entity.Order;
import com.manager.login.Service.DishService;
import com.manager.login.Service.OrderService;
import com.manager.login.ServiesImpl.DishServiceimpl;
import com.manager.login.ServiesImpl.OrderServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    OrderServiceimpl orderService;
    @Autowired
    DishServiceimpl dishService;

    @GetMapping(value = "/create_order")
    public int createorderById(@RequestParam int user_id, @RequestParam int table_id) {
        return orderService.createOrder(user_id, table_id);
    }

    @PostMapping(value = "/insert_dis h_byId")
    public boolean insertDishById(@RequestParam int order_id, @RequestParam int dish_id,@RequestParam int dish_num) {
        return orderService.insertDishbyid(order_id, dish_id,dish_num);
    }

    @PostMapping(value = "/delete_dish_byId")
    public boolean deleteDishById(@RequestParam int order_id, @RequestParam int dish_id) {
        return orderService.deleteDishbyid(order_id, dish_id);
    }

    @GetMapping(value="/show_dish_list")
    public List<Dish> show_dish_list(@RequestParam int page_num, @RequestParam int page_size){
        return orderService.ShowDishlist(page_num,page_size);
    }

//    @GetMapping(value="/show_order_byState")
//    public List<Order> show_order_byState(@RequestParam("state") int state,@RequestParam("page_num") int page_num,@RequestParam("page_size") int page_size){
//        System.out.println("show_order_byState");
//        return orderService.ShowOrderByState(state,page_num,page_size);
//    }
    @GetMapping(value="/show_order_byState")
    public List<Order> show_order_byState(@RequestParam("state") String state,@RequestParam("page_num") String page_num,@RequestParam("page_size") String page_size){
        int mystate = Integer.parseInt(state);
        int mypage_num = Integer.parseInt(page_num);
        int mypage_size = Integer.parseInt(page_size);
        System.out.println("show_order_byState");
        return orderService.ShowOrderByState(mystate,mypage_num,mypage_size);
    }

    @GetMapping(value="/show_totalprice")
    public Order show_total_price(@RequestParam int order_id, @RequestParam int user_id){
        return orderService.Show_totalPrice(order_id,user_id);
    }

    @PostMapping(value="/update_dish_ordered")
    public boolean update_dish_ordered(@RequestParam int order_id,
                                       @RequestParam int dish_id,
                                       @RequestParam int dish_num,
                                       @RequestParam int dish_state,
                                       @RequestParam String note){
        return orderService.UpdateDish_Ordered(order_id,dish_id,dish_num,dish_state,note);
    }

    @PostMapping(value="/update_order")
    public boolean update_order(@RequestParam int order_id,
                                @RequestParam int order_state,
                                @RequestParam float order_discount,
                                @RequestParam String note
                                       ){
        return orderService.UpdateOrder(order_id,order_state,order_discount,note);
    }

    @GetMapping(value="/show_dish_ordered")
    public List<Dish_ordered> showDishOrdered(@RequestParam int order_id){
        return orderService.ShowOrderedDish(order_id);
    }

    @GetMapping(value="/get_ordered_dishbystate")
    public List<Dish_ordered> get_ordered_dishbystate(@RequestParam int state,@RequestParam int page_num,@RequestParam int pagesize){
        return orderService.ShowDish_orderedByState(state,page_num,pagesize);
    }

    @GetMapping(value = "/get_order_byid")
    public Order getOrderById(@RequestParam int order_id){
        return orderService.getOrderById(order_id);
    }
}

