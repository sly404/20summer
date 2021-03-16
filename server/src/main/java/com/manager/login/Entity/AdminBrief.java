package com.manager.login.Entity;

public class AdminBrief {
    private int admin_id;
    private String real_name;
    private String sex;
    private String birthday;
    private String note;
    private String admin_type;
    private String state;


    public void setAdmin_type(String admin_type) {
        this.admin_type = admin_type;
    }

    public String getAdmin_type() {
        return admin_type;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getReal_name() {
        return real_name;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
}
