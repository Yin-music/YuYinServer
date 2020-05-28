package com.music.controller;

import com.music.entity.Song;
import com.music.service.SongService;
import com.music.utils.TraverseUtils;
import com.sun.media.sound.SoftTuning;
import org.junit.Test;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.File;
import java.util.*;

/**
 * (Song)表控制层
 *
 * @author makejava
 * @since 2020-05-25 11:24:38
 */
@RestController
@RequestMapping("song")
public class SongController {
    /**
     * 服务对象
     */
    @Resource
    private SongService songService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Song selectOne(Integer id) {
        return this.songService.queryById(id);
    }

    @GetMapping("/findSongByLike/{name}")
    public List<Song> findSongByLike(@PathVariable String name) {
        System.out.println(name);
        List<Song> songs = songService.findSongByLike(name);
        System.out.println(songs);
        return songs;
    }

    @GetMapping("/findAll")
    public List<String> findAll() {
        List<Song> songs = songService.queryAllByLimit(0, 1000);
        List<String> name = new ArrayList<>();
        for (Song song : songs) {
            name.add(song.getName());
        }
        File file = new File("C:\\Users\\Hao\\Desktop\\data\\song");
        System.out.println(name+"================"+name.size());
        List<String> listf = TraverseUtils.listf(file);
        //System.out.println(listf+"---------------------------"+listf.size());

        TreeSet<String> treeSet = new TreeSet<>();
        for(int i=0;i<listf.size();i++){
            treeSet.add(listf.get(i));
        }
        List<String> l = new ArrayList<>();
        for(int i=0;i<name.size();i++){
            boolean add = treeSet.add(name.get(i));
            if(add){
                l.add(name.get(i));
                System.out.println(name.get(i)+"---------"+l.size());
            }
        }
        //System.out.println(treeSet.size());
        return l;

    }
    @Test
    public void test(){
        TreeSet<String> treeSet = new TreeSet<>();
        boolean a = treeSet.add("a");
        System.out.println(a);
        boolean b = treeSet.add("a");
        System.out.println(b);
    }

}