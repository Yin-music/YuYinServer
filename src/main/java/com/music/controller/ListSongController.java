package com.music.controller;

import com.music.entity.ListSong;
import com.music.service.ListSongService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ListSong)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:23:56
 */
@RestController
@RequestMapping("listSong")
public class ListSongController {
    /**
     * 服务对象
     */
    @Resource
    private ListSongService listSongService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ListSong selectOne(Integer id) {
        return this.listSongService.queryById(id);
    }

}