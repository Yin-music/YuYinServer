package com.music.service;

import com.music.entity.Rank;
import java.util.List;

/**
 * (Rank)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 11:24:11
 */
public interface RankService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Rank queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Rank> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    Rank insert(Rank rank);

    /**
     * 修改数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    Rank update(Rank rank);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}