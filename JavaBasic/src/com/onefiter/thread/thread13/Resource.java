package com.onefiter.thread.thread13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  改进为高性能的Lock接口和线程的阻塞队列
 */
public class Resource {
   private int count ;
   private boolean flag ;
   private Lock lock = new ReentrantLock();//Lock接口实现类对象

    //Lock接口锁,创建出2个线程的阻塞队列
    private Condition prod = lock.newCondition();//生产者线程阻塞队列
    private Condition cust = lock.newCondition();//消费者线程阻塞队列

   //消费者调用
   public  void getCount() {
       lock.lock();//获取锁
         //flag是false,消费完成,等待生产
         while (!flag)
            //无限等待,消费线程等待,执行到这里的线程,释放锁,进入到消费者的阻塞队列
             try{cust.await();}catch (Exception ex){}

         System.out.println("消费第"+count);
            //修改标志位,为消费完成
         flag = false;
         //唤醒生产线程队列中的一个
         prod.signal();
         lock.unlock();//释放锁
   }
   //生产者调用
   public  void setCount() {
       lock.lock();//获取锁
         //flag是true,生产完成,等待消费
       while (flag)
            //无限等待,释放锁,进入到生产线程队列
            try{prod.await();}catch (Exception ex){}
         count++;
         System.out.println("生产第"+count+"个");
         //修改标志位,为生产完成
         flag = true;
         //唤醒消费者线程阻塞队列中年的一个
         cust.signal();
       lock.unlock();//释放锁
   }
}
