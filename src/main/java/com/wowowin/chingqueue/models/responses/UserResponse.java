package com.wowowin.chingqueue.models.responses;

import java.util.Date;

public class UserResponse {
    private String full_name;
    private String username;
    private String password;
    private String contact_num;
    private String address;
    private Date create_dt;

    public UserResponse(String full_name, String username, String password, String contact_num, String address, Date create_dt) {

        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.contact_num = contact_num;
        this.address = address;
        this.create_dt = create_dt;
    }

    public UserResponse() {
    }


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact_num() {
        return contact_num;
    }

    public void setContact_num(String contact_num) {
        this.contact_num = contact_num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }
}
