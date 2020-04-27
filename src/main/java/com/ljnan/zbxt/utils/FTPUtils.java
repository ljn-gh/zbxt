package com.ljnan.zbxt.utils;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import java.util.Arrays;

/**
 * @author lijianan
 * @date 2020-01-13 18:10
 */
public class FTPUtils {
    private FTPClient ftpClient;
    @Test
    public void init() {
        try {
            ftpClient = new FTPClient();
            ftpClient.connect("172.18.72.217",21);
            ftpClient.login("ljn","963.963.");
            System.out.println("连接成功。。。。");
            File file=new File("C:/Users/Administrator/Desktop/file.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ftpClient.retrieveFileStream(file.getName().substring(file.getName().lastIndexOf("/")));
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.setControlEncoding("GBK");
            ftpClient.enterLocalPassiveMode();
            String[] strings = ftpClient.listNames();
            System.out.println(Arrays.asList(strings).toString());
        }catch (SocketException e){
            System.out.println("登陆失败");
            System.out.println(e.toString());
        }catch (IOException e){
            System.out.println("上传失败");
            System.out.println(e.toString());
        }

    }
}
