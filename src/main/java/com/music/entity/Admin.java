package com.music.entity;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:21:23
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 602328833297957710L;
    
    private Object id;
    
    private String name;
    
    private String password;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}