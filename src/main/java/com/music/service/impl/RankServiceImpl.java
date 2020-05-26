package com.music.service.impl;

import com.music.entity.Rank;
import com.music.dao.RankDao;
import com.music.service.RankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Rank)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 11:24:11
 */
@Service("rankService")
public class RankServiceImpl implements RankService {
    @Resource
    private RankDao rankDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Rank queryById(Object id) {
        return this.rankDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Rank> queryAllByLimit(int offset, int limit) {
        return this.rankDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    @Override
    public Rank insert(Rank rank) {
        this.rankDao.insert(rank);
        return rank;
    }

    /**
     * 修改数据
     *
     * @param rank 实例对象
     * @return 实例对象
     */
    @Override
    public Rank update(Rank rank) {
        this.rankDao.update(rank);
        return this.queryById(rank.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.rankDao.deleteById(id) > 0;
    }
}