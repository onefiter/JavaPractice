package com.onefiter.thread.thread3;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class PriorityThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println(Thread.currentThread().getName()+"i.."+ i);
        }
    }
}
