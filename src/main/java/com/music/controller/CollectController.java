package com.music.controller;

import com.music.entity.Collect;
import com.music.service.CollectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Collect)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:23:41
 */
@RestController
@RequestMapping("collect")
public class CollectController {
    /**
     * 服务对象
     */
    @Resource
    private CollectService collectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Collect selectOne(Integer id) {
        return this.collectService.queryById(id);
    }

}