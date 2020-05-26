package com.music.controller;

import com.music.entity.SongList;
import com.music.service.SongListService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SongList)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:24:51
 */
@RestController
@RequestMapping("songList")
@CrossOrigin
public class SongListController {
    /**
     * 服务对象
     */
    @Resource
    private SongListService songListService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SongList selectOne(Integer id) {
        return this.songListService.queryById(id);
    }

    /**
     * 查找全部歌单
     * @return
     */
    @GetMapping("/listSongLists")
    public List<SongList> findAllSongList(){
        System.out.println("访问了findAllSongList方法");
        List<SongList> songLists = songListService.queryAllByLimit(0, 1000);
        /*System.out.println(songLists);*/
        return songLists;
    }
    @GetMapping("/likeStyle")
    public List<SongList> likeStyle(String style){
        System.out.println(style);
        return songListService.findByStyle(style);
    }
}