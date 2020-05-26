package com.music.service;

import com.music.entity.ListSong;
import java.util.List;

/**
 * (ListSong)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 11:23:56
 */
public interface ListSongService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ListSong queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ListSong> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    ListSong insert(ListSong listSong);

    /**
     * 修改数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    ListSong update(ListSong listSong);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}