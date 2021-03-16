package com.manager.login.Entity;

import javax.xml.crypto.Data;

public class Admin {
    private int admin_id;
    private int admin_type;
    private String user_name;
    private String real_name;
    private String phone;
    private String password;
    private String sex;
    private String birthday;
    private String build_time;
    private String State;
    private String note;

    public void setState(String state) {
        State = state;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public int getAdmin_type() {
        return admin_type;
    }

    public String getState() {
        return State;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBuild_time() {
        return build_time;
    }

    public String getNote() {
        return note;
    }

    public String getPhone() {
        return phone;
    }

    public String getReal_name() {
        return real_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public void setAdmin_type(int admin_type) {
        this.admin_type = admin_type;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBuild_time(String build_time) {
        this.build_time = build_time;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
