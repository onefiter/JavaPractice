package com.onefiter.thread.thread8;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class ThreadTest {

    public static void main(String[] args) {
        ThreadDeadLock threadDeadLock = new ThreadDeadLock(true);
        ThreadDeadLock threadDeadLock2 = new ThreadDeadLock(false);

        new Thread(threadDeadLock).start();
        new Thread(threadDeadLock2).start();
    }
}
