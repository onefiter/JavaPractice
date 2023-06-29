package com.onefiter.thread.thread4;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        JoinThread t0 = new JoinThread();
        JoinThread t1 = new JoinThread();

        t0.start();
        t0.join();
        t1.start();
    }
}
