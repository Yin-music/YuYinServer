package com.music.service.impl;

import com.music.entity.Consumer;
import com.music.dao.ConsumerDao;
import com.music.pojo.MyCoolect;
import com.music.service.ConsumerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * (Consumer)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 11:23:23
 */
@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService {
    @Resource
    private ConsumerDao consumerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Consumer queryById(Object id) {
        /*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar instance = Calendar.getInstance();
        instance.setTime();*/
        //this.consumerDao.queryById(id);
        /*Consumer consumer = this.consumerDao.queryById(id);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = consumer.getBirth();
        String format = simpleDateFormat.format(birth);
        System.out.println("------"+format+"----------");
        try {
            Date parse = simpleDateFormat.parse(format);
            consumer.setBirth(parse);
            System.out.println("------"+parse+"----------");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = simpleDateFormat.parse(format, parsePosition);

        DateFormat.getInstance(DateFoemat.SHTP,cji);
        return consumer;*/
        return this.consumerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Consumer> queryAllByLimit(int offset, int limit) {
        return this.consumerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    @Override
    public Consumer insert(Consumer consumer) {
        this.consumerDao.insert(consumer);
        return consumer;
    }

    /**
     * 修改数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    @Override
    public Consumer update(Consumer consumer) {
        this.consumerDao.update(consumer);
        return this.queryById(consumer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.consumerDao.deleteById(id) > 0;
    }

    @Override
    public List<MyCoolect> findCollectById(Integer id) {
        return this.consumerDao.findCollectById(id);

    }
}