package com.music.service;

import com.music.entity.SongList;
import java.util.List;

/**
 * (SongList)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 11:24:51
 */
public interface SongListService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SongList queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SongList> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    SongList insert(SongList songList);

    /**
     * 修改数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    SongList update(SongList songList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);
    List<SongList> findByStyle(String style);

}