package com.music.utils;

import org.junit.Test;

import javax.swing.event.ListDataEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TraverseUtils {
    @Test
    public void Traverse(){
        File file = new File("C:\\Users\\Hao\\Desktop\\data\\song");
        listf(file);
    }
    public static List<String> listf(File file){
        List<String> list = new ArrayList<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                //System.out.println(file1.getName());
                //System.out.println(file1.getName().substring(file1.getName().lastIndexOf('.')));
//                if(file1.getName().contains(".mp3")){
//                    System.out.println(file1.getName());
//                }
                if(file1.getName().substring(file1.getName().lastIndexOf('.')).equals(".mp3")){
                    //System.out.println(file1.getName().replace(".mp3",""));
                    list.add(file1.getName().replace(".mp3",""));
                }
                if(file1.getName().substring(file1.getName().lastIndexOf('.')).equals(".m4a")){
                    //System.out.println(file1.getName().replace(".mp3",""));
                    list.add(file1.getName().replace(".m4a",""));
                }
            }else {
                listf(file1);
            }
        }
        /*System.out.println(list);

        System.out.println(list.size());*/
        return list;
    }
}
