package com.onefiter.IO.iostream.file;

import java.io.File;

/**
 * author: onefiter
 * date: 2023/6/30
 */
public class FileTest2 {
    public static void main(String[] args) {
        fileMethod();
    }

    /**
     * 遍历目录
     */
    public static void fileMethod(){
        File file = new File("C:\\Program Files\\Java\\jdk1.8.0_311");
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }


    /**
     * 目录的递归遍历 : 传递参数,遍历哪个路径,传递过来
     */
    public static void foreachDir(File dir){
        System.out.println(dir);
        //listFiles()遍历目录  C:\Java\jdk1.8.0_221
        File[] files = dir.listFiles();
        //遍历数组,取出数组中的File对象
        //是遍历到的所有文件的全路径 (绝对路径)
        for(File f : files){
            //判断遍历到的路径是不是文件夹
            if(f.isDirectory()) //C:\Java\jdk1.8.0_221\jre  ,进入继续遍历
                //递归调用自己,传递路径
                foreachDir(f);
            else
                System.out.println(f);
        }
    }
}
