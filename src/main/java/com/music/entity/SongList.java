package com.music.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (SongList)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:24:51
 */
@Data
public class SongList implements Serializable {
    private static final long serialVersionUID = 580609653835841266L;
    
    private Object id;
    
    private String title;
    
    private String pic;
    
    private String introduction;
    
    private String style;


}