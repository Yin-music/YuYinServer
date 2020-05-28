package com.music.service.impl;

import com.music.entity.Singer;
import com.music.dao.SingerDao;
import com.music.service.SingerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Singer)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 11:24:25
 */
@Service("singerService")
public class SingerServiceImpl implements SingerService {
    @Resource
    private SingerDao singerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Singer queryById(Object id) {
        return this.singerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Singer> queryAllByLimit(int offset, int limit) {
        return this.singerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public Singer insert(Singer singer) {
        this.singerDao.insert(singer);
        return singer;
    }

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public Singer update(Singer singer) {
        this.singerDao.update(singer);
        return this.queryById(singer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.singerDao.deleteById(id) > 0;
    }

    @Override
    public List<Singer> findSingerAll() {
        return this.singerDao.findSingerAll();
    }

    @Override
    public List<Singer> findSingerBySex(Integer sex) {
        return this.singerDao.findSingerBySex(sex);
    }
}