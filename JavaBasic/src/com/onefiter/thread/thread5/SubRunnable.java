package com.onefiter.thread.thread5;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class SubRunnable implements Runnable {
    @Override
    public void run() {
        for(int x = 0 ; x < 50 ;x++){
            System.out.println(Thread.currentThread().getName()+"x.."+x);
        }
    }
}
