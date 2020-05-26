package com.music.service.impl;

import com.music.entity.ListSong;
import com.music.dao.ListSongDao;
import com.music.service.ListSongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ListSong)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 11:23:56
 */
@Service("listSongService")
public class ListSongServiceImpl implements ListSongService {
    @Resource
    private ListSongDao listSongDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ListSong queryById(Object id) {
        return this.listSongDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ListSong> queryAllByLimit(int offset, int limit) {
        return this.listSongDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    @Override
    public ListSong insert(ListSong listSong) {
        this.listSongDao.insert(listSong);
        return listSong;
    }

    /**
     * 修改数据
     *
     * @param listSong 实例对象
     * @return 实例对象
     */
    @Override
    public ListSong update(ListSong listSong) {
        this.listSongDao.update(listSong);
        return this.queryById(listSong.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.listSongDao.deleteById(id) > 0;
    }
}