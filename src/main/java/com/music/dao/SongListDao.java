package com.music.dao;

import com.music.entity.SongList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SongList)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-25 11:24:51
 */
@Mapper
public interface SongListDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SongList queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SongList> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param songList 实例对象
     * @return 对象列表
     */
    List<SongList> queryAll(SongList songList);

    /**
     * 新增数据
     *
     * @param songList 实例对象
     * @return 影响行数
     */
    int insert(SongList songList);

    /**
     * 修改数据
     *
     * @param songList 实例对象
     * @return 影响行数
     */
    int update(SongList songList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

    /**
     * 根据类别查找歌单
     * @param style
     * @return
     */
    List<SongList> findByStyle(String style);

}