package com.music.controller;

import com.music.entity.Consumer;
import com.music.pojo.MyCoolect;
import com.music.service.ConsumerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
     * 通过ID查询个人资料
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Consumer selectOne(@PathVariable Integer id) {
        //System.out.println(id);
        //System.out.println(this.consumerService.queryById(id));
        return this.consumerService.queryById(id);
    }

    @GetMapping("findCollectById/{id}")
    public List<MyCoolect> findCollectById(@PathVariable Integer id){
        System.out.println(this.consumerService.findCollectById(id));
        //System.out.println("执行查询收藏列表了码");
        //System.out.println(this.consumerService.findCollectById(5));
        return this.consumerService.findCollectById(id);


    }

}