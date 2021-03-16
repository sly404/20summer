package com.manager.login.Entity;

import java.sql.Timestamp;
import java.util.Date;

public class Order {
    private int order_id;
    private Date build_time;
    private Date settlement_time;
    private int user_id;
    private int table_id;
    private int order_state;
    private double total_price;
    private double order_discount;
    private String order_note;
    private String user_name;
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public Date getBuild_time() {
        return build_time;
    }
    public void setBuild_time(Timestamp build_time) {
        this.build_time = build_time;
    }
    public Date getSettlement_time() {
        return settlement_time;
    }
    public void setSettlement_time(Timestamp settlement_time) {
        this.settlement_time = settlement_time;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getTable_id() {
        return table_id;
    }
    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }
    public int getOrder_state() {
        return order_state;
    }
    public void setOrder_state(int order_state) {
        this.order_state = order_state;
    }
    public double getTotal_price() {
        return total_price;
    }
    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
    public double getOrder_discount() {
        return order_discount;
    }
    public void setOrder_discount(double order_discount) {
        this.order_discount = order_discount;
    }
    public String getOrder_note() {
        return order_note;
    }
    public void setOrder_note(String order_note) {
        this.order_note = order_note;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
