package com.music.service.impl;

import com.music.entity.SongList;
import com.music.dao.SongListDao;
import com.music.service.SongListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SongList)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 11:24:51
 */
@Service("songListService")
public class SongListServiceImpl implements SongListService {
    @Resource
    private SongListDao songListDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SongList queryById(Object id) {
        return this.songListDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SongList> queryAllByLimit(int offset, int limit) {
        return this.songListDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    @Override
    public SongList insert(SongList songList) {
        this.songListDao.insert(songList);
        return songList;
    }

    /**
     * 修改数据
     *
     * @param songList 实例对象
     * @return 实例对象
     */
    @Override
    public SongList update(SongList songList) {
        this.songListDao.update(songList);
        return this.queryById(songList.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.songListDao.deleteById(id) > 0;
    }

    @Override
    public List<SongList> findByStyle(String style) {
        return this.songListDao.findByStyle(style);
    }
}