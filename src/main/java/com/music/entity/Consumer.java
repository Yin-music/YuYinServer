package com.music.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Consumer)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:23:23
 */
@Data
public class Consumer implements Serializable {
    private static final long serialVersionUID = 826096413447840602L;
    
    private Object id;
    
    private String username;
    
    private String password;
    
    private Object sex;
    
    private String phoneNum;
    
    private String email;

    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    
    private String introduction;
    
    private String location;
    
    private String avator;
    
    private Date createTime;
    
    private Date updateTime;




}