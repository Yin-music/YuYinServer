package com.music.controller;

import com.music.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    @Autowired
    private UploadUtils uploadUtils;

    @PostMapping("/upload")
    public String upload(MultipartFile multipartFile){
        System.out.println("访问了上传接口");
        String filename = multipartFile.getOriginalFilename();
        System.out.println(filename+"=============文件名");
        return uploadUtils.upload(multipartFile);
    }
}
