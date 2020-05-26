package com.music.controller;

import com.music.entity.Consumer;
import com.music.service.ConsumerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Consumer)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:23:23
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    /**
     * 服务对象
     */
    @Resource
    private ConsumerService consumerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Consumer selectOne(Integer id) {
        return this.consumerService.queryById(id);
    }

}