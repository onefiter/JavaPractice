package com.onefiter.thread.thread3;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class ThreadTest {
    /**
     * 线程的优先级，都是默认的
     */

    public static void main(String[] args) {
        PriorityThread t0 = new PriorityThread();
        PriorityThread t1 = new PriorityThread();
        // 获取线程的默认值

        System.out.println("t0.getPriority() = " + t0.getPriority());
        System.out.println("t1.getPriority() = " + t1.getPriority());

        //设置线程的优先级
        t0.setPriority(Thread.MAX_PRIORITY);// 理论: 优先级高的线程,占用CPU的时间相对长一些
        t1.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        t1.start();

        System.out.println("t0.getPriority() = " + t0.getPriority());
        System.out.println("t1.getPriority() = " + t1.getPriority());

    }
}
