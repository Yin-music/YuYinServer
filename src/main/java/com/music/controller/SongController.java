package com.music.controller;

import com.music.entity.Song;
import com.music.service.SongService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Song)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:24:38
 */
@RestController
@RequestMapping("song")
public class SongController {
    /**
     * 服务对象
     */
    @Resource
    private SongService songService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Song selectOne(Integer id) {
        return this.songService.queryById(id);
    }

}