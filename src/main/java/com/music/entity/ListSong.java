package com.music.entity;

import java.io.Serializable;

/**
 * (ListSong)实体类
 *
 * @author makejava
 * @since 2020-05-25 11:23:56
 */
public class ListSong implements Serializable {
    private static final long serialVersionUID = -10146589026586984L;
    
    private Object id;
    
    private Object songId;
    
    private Object songListId;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
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

}