package com.onefiter.thread.thread2;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class ThreadName extends  Thread {
    @Override
    public void run() {
        System.out.println("线程名字:: "+ super.getName());
    }
}
