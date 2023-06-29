package com.onefiter.thread.thread12;

/**
 * author: onefiter
 * date: 2023/6/29
 */


/**
 * 消费者线程
 *   资源对象中的变量输出打印
 */
public class Customer implements Runnable{
    private Resource r ;

    public Customer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getCount();
        }
    }
}

/**
 *   synchronized (r) {
 *                 //是否要消费,判断标志位 ,允许消费才能执行
 *                 if (!r.flag )
 *                     //消费完成,不能再次消费,等待生产
 *                     try{r.wait();}catch (Exception ex){}
 *                 System.out.println("消费第" + r.count);
 *                     //消费完成后,修改标志位,变成已经消费
 *                 r.flag = false;
 *                 //唤醒生产线程
 *                 r.notify();
 *             }
 *         }
 */
