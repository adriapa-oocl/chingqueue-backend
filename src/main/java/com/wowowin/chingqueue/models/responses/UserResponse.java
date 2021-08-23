package com.wowowin.chingqueue.models.responses;

import java.util.Date;

public class UserResponse {

    private Integer user_id;
    private String full_name;
    private String username;
    private String password;
    private String email;
    private String contact_num;
    private String address;
    private Date create_dt;

    public UserResponse(Integer user_id, String full_name, String username, String password, String email, String contact_num, String address, Date create_dt) {
        this.user_id = user_id;
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
