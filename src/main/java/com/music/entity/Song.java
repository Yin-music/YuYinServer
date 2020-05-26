package com.music.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Song)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:24:38
 */
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


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getSingerId() {
        return singerId;
    }

    public void setSingerId(Object singerId) {
        this.singerId = singerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}