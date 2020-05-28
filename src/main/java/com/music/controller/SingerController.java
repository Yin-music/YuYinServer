package com.music.controller;

import com.music.entity.Singer;
import com.music.service.SingerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Singer)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:24:25
 */
@RestController
@RequestMapping("singer")
public class SingerController {
    /**
     * 服务对象
     */
    @Resource
    private SingerService singerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Singer selectOne(Integer id) {
        return this.singerService.queryById(id);
    }

    //查询所有歌手
    @GetMapping("findSingerAll")
    public List<Singer> findSingerAll(){
        System.out.println("查询歌手的请求");
        return this.singerService.findSingerAll();
    }

    //按性别查询所有歌手
    @GetMapping("findSingerBySex/{sex}")
    public List<Singer> findSingerBySex(@PathVariable Integer sex){
        return this.singerService.findSingerBySex(sex);
    }
}