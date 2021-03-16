package com.manager.login.Entity;

public class Dish_ordered {
    private int order_dish_id;
    private int order_id;
    private int dish_id;
    private int dish_num;
    private int dish_state;
    private String note;
    private String dish_name;
    private float dish_price;

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_dish_id(int order_dish_id) {
        this.order_dish_id = order_dish_id;
    }
    public int getOrder_dish_id() {
        return order_dish_id;
    }
    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }
    public int getDish_id() {
        return dish_id;
    }
    public void setDish_num(int dish_num) {
        this.dish_num = dish_num;
    }
    public int getDish_num() {
        return dish_num;
    }
    public void setDish_state(int dish_state) {
        this.dish_state = dish_state;
    }
    public int getDish_state() {
        return dish_state;
    }
    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }
    public String getDish_name() {
        return dish_name;
    }
    public void setDish_price(float dish_price) {
        this.dish_price = dish_price;
    }
    public float getDish_price() {
        return dish_price;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}
