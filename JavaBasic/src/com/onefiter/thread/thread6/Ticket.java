package com.onefiter.thread.thread6;

/**
 * author: onefiter
 * date: 2023/6/29
 */

/**
 * 票源对象,需要多个线程同时操作
 */
public class Ticket implements Runnable{

    //定义票源
    private int tickets = 100;
    private Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(20); // 线程休眠,暂停执行
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " 出售第" + tickets + "张");
                    tickets--;
                }
            }
        }
    }
}
