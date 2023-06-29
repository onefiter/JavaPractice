package com.onefiter.thread.thread9;

/**
 * author: onefiter
 * date: 2023/6/29
 */

/**
 * 模拟多个窗口同时售票
 */
public class ThreadTest {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        //创建3个窗口,3个线程
        Thread t0 = new Thread(ticket);
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        t0.start();
        t1.start();
        t2.start();
    }
}
