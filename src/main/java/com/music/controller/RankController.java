package com.music.controller;

import com.music.entity.Rank;
import com.music.service.RankService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Rank)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:24:11
 */
@RestController
@RequestMapping("rank")
public class RankController {
    /**
     * 服务对象
     */
    @Resource
    private RankService rankService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Rank selectOne(Integer id) {
        return this.rankService.queryById(id);
    }

}