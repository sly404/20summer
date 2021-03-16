package com.manager.login.Entity;

public class Data {
    private int order_id;
    private String settlement_time;
    private int user_id;
    private double total_price;

    public double getTotal_price() {
        return total_price;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getSettlement_time() {
        return settlement_time;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setSettlement_time(String settlement_time) {
        this.settlement_time = settlement_time;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

}
