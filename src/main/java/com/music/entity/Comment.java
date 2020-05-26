package com.music.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:22:58
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = 417079370156505524L;
    
    private Object id;
    
    private Object userId;
    
    private Object songId;
    
    private Object songListId;
    
    private String content;
    
    private Date createTime;
    
    private Object type;
    
    private Object up;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getUp() {
        return up;
    }

    public void setUp(Object up) {
        this.up = up;
    }

}