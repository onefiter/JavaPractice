package com.onefiter.thread.thread1;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 创建线程程序
        SubThread subThread = new SubThread();
        // 调用子类对象的方法start()启动线程
        // 启动线程，JVM调用方法run
        subThread.start();
        for (int x = 0; x < 50; x++) {
            System.out.println("main..."+x);
        }
    }
}
