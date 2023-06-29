package com.onefiter.thread.thread1;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class SubThread extends Thread {
    public void run() {
        for (int x = 0; x < 5000; x++) {
            System.out.println("run..." + x);
        }
    }
}
