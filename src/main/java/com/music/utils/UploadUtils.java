package com.music.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
@Component
public class UploadUtils {
    public String upload(MultipartFile multipartFile) {
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.huanan());
        //...其他参数参考类注释

        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = "vsXqZoxIkEm88qJceQ-Cs7XRWibTO_-yoPiOsSSE";
        String secretKey = "S9eeM3eIiXLDL1SDKekZKru8FL3SP9O0gtpHFSOv";
        String bucket = "yuyinmusic";

        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = null;

        try {
            byte[] bytes = multipartFile.getBytes();
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);

            try {
                Response response = uploadManager.put(bytes, key, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(putRet.key+"------------key");
                System.out.println(putRet.hash+"-------------hash");
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (IOException ex) {
            //ignore
        }
        return "";
    }
}
