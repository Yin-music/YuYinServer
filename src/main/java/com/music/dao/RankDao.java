package com.music.dao;

import com.music.entity.Rank;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Rank)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-25 11:24:11
 */
@Mapper
public interface RankDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Rank queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Rank> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param rank 实例对象
     * @return 对象列表
     */
    List<Rank> queryAll(Rank rank);

    /**
     * 新增数据
     *
     * @param rank 实例对象
     * @return 影响行数
     */
    int insert(Rank rank);

    /**
     * 修改数据
     *
     * @param rank 实例对象
     * @return 影响行数
     */
    int update(Rank rank);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}