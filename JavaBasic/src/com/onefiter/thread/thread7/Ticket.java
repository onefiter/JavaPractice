package com.onefiter.thread.thread7;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class Ticket implements Runnable {

    private static int tickets = 100;

    @Override
    public void run() {
        while (true)
            sale();
    }

    private static synchronized void sale(){
        //  synchronized (Ticket.class) {
        if (tickets > 0) {
            try {
                Thread.sleep(20);//线程休眠,暂停执行
            } catch (Exception ex) {
            }
            System.out.println(Thread.currentThread().getName() + " 出售第" + tickets + "张");
            tickets--;
        }
        //  }
    }
}
