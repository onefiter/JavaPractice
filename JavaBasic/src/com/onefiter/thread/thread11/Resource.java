package com.onefiter.thread.thread11;

/**
 * author: onefiter
 * date: 2023/6/29
 */
/**
 * 定义资源对象
 *   成员 : 产生商品的计数器
 *          标志位
 */

/**
 * 定义资源对象
 *   成员 : 产生商品的计数器
 *          标志位
 */
public class Resource {
    private int count ;
    private boolean flag ;

    //消费者调用
    public synchronized void getCount() {
        //flag是false,消费完成,等待生产
        if (!flag)
            //无限等待
            try{this.wait();}catch (Exception ex){}
        System.out.println("消费第"+count);
        //修改标志位,为消费完成
        flag = false;
        //唤醒对方线程
        this.notify();
    }
    //生产者调用
    public synchronized void setCount() {
        //flag是true,生产完成,等待消费
        if (flag)
            //无限等待
            try{this.wait();}catch (Exception ex){}
        count++;
        System.out.println("生产第"+count+"个");
        //修改标志位,为生产完成
        flag = true;
        //唤醒对方线程
        this.notify();
    }
}
