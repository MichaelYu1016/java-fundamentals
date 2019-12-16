package com.example.io;

import java.io.File;

/**
 * 创建目录，读取目录，删除目录或文件
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-17
 * @modified_date 2019-10-17
 */
public class DirList {

    public static void main(String[] args) {
        String dirname = "/temp/iotest";
        File f1 = new File(dirname);
        f1.mkdirs();
        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String[] s = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        }else {
            System.out.println(dirname + " is not a directory");
        }
        //删除iotest文件夹
        deleteFolder(f1);
    }


    //删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();

    }
}
