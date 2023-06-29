package com.onefiter.thread.thread9;

/**
 * author: onefiter
 * date: 2023/6/29
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  优化为juc包的接口Lock
 */
public class Ticket implements Runnable {

    //定义票源
    private static int tickets = 100;

    //获取Lock接口的实现类对象
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true)
            sale();
    }

    private void sale(){
        //获取锁
        lock.lock();
        if (tickets > 0) {
            try {
                Thread.sleep(20);//线程休眠,暂停执行
            } catch (Exception ex) {
            }
            System.out.println(Thread.currentThread().getName() + " 出售第" + tickets + "张");
            tickets--;
        }

        //释放锁
        lock.unlock();
    }
}
