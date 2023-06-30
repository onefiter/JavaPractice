package com.onefiter.IO.iostream.file;

import java.io.File;

/**
 * author: onefiter
 * date: 2023/6/30
 */
public class FileTest {

    public static void main(String[] args) {
        fileMethod2();

    }

    /**
     *   File类获取方法
     * - String getName() 获取名字,File构造方法中的路径的名字
     * - String getPath() 获取File构造方法中的路径,完整的路径转成String返回
     */
    public static void fileMethod() {
        File file = new File("C:\\Program Files\\Java\\jdk1.8.0_311\\bin\\java.exe");

        String name = file.getName();
        System.out.println("name = " + name);

        String path = file.getPath();

        System.out.println("path = " + path);
    }


    /**
     * File类的获取方法
     * - File getAbsoluteFile() 获取绝对路径,返回值是File类型
     * - File getParentFile() 获取父路径,返回值是File类型
     */
    public static void  fileMethod2() {
        File file = new File("C:\\Program Files\\Java\\jdk1.8.0_311\\bin\\java.exe");
        //获取绝对路径
        File absoluteFile = file.getAbsoluteFile();
        System.out.println("absoluteFile = " + absoluteFile);

        //获取父路径
        File parentFile = file.getParentFile().getParentFile();
        System.out.println("parentFile = " + parentFile);
        //文件的字节数
        long length = file.length();
        System.out.println("length = " + length);

    }

}
