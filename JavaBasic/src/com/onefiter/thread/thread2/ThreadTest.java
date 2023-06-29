package com.onefiter.thread.thread2;

/**
 * author: onefiter
 * date: 2023/6/29
 */

/**
 * 线程的名字,每个线程都有自己的名字
 * 线程默认的名字 thread-0 , thread-1  , thread-2
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("name::"+thread.getName());

        ThreadName threadName = new ThreadName();

//        threadName.setName("旺旺");
        threadName.start();

    }
}
