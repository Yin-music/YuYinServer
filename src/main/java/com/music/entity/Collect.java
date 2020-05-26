package com.music.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Collect)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:23:41
 */
public class Collect implements Serializable {
    private static final long serialVersionUID = 841995426565413200L;
    
    private Object id;
    
    private Object userId;
    
    private Object type;
    
    private Object songId;
    
    private Object songListId;
    
    private Date createTime;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getSongId() {
        return songId;
    }

    public void setSongId(Object songId) {
        this.songId = songId;
    }

    public Object getSongListId() {
        return songListId;
    }

    public void setSongListId(Object songListId) {
        this.songListId = songListId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}