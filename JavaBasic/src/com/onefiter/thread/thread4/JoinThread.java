package com.onefiter.thread.thread4;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class JoinThread extends Thread {
    @Override
    public void run() {
        for(int x = 0 ; x < 50 ;x++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"x.."+x);
        }
    }
}
