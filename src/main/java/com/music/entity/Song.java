package com.music.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Song)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:24:38
 */
@Data
public class Song implements Serializable {
    private static final long serialVersionUID = -81941096854317422L;
    
    private Object id;
    
    private Object singerId;
    
    private String name;
    
    private String introduction;
    /**
    * 发行时间
    */
    private Date createTime;
    
    private Date updateTime;
    
    private String pic;
    
    private String lyric;
    
    private String url;

}