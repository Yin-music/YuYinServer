package com.music.dao;

import com.music.entity.Singer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Singer)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-25 11:24:25
 */
@Mapper
public interface SingerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Singer queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Singer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param singer 实例对象
     * @return 对象列表
     */
    List<Singer> queryAll(Singer singer);

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 影响行数
     */
    int insert(Singer singer);

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 影响行数
     */
    int update(Singer singer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

    //查询所有歌手
    List<Singer> findSingerAll();
    //按性别查询所有歌手
    List<Singer> findSingerBySex(Integer sex);
}