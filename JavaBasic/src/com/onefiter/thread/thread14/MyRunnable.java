package com.onefiter.thread.thread14;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始启动");
    }
}
