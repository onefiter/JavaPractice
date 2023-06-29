package com.onefiter.thread.thread5;



/**
 * author: onefiter
 * date: 2023/6/29
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        //创建接口实现类对象
        Runnable r = new SubRunnable();
        //创建Thread对象,构造方法传递接口实现类
        Thread t0 = new Thread(r);
        t0.start();

        for(int x = 0 ; x < 50 ;x++){
            System.out.println(Thread.currentThread().getName()+"x.."+x);
        }
    }
}
