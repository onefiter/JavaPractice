package com.onefiter.thread.thread11;

/**
 * author: onefiter
 * date: 2023/6/29
 */
/**
 * 生产者线程
 *   资源对象中的变量++
 */
public class Produce implements Runnable{

    private Resource r ;

    public Produce(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.setCount();
        }
    }
}
/**
 *  synchronized (r) {
 *                 //判断标志位,是否允许生产
 *                 //flag是true,生产完成,等待消费
 *                 if (r.flag )
 *                     //无限等待
 *                    try{ r.wait();
 *                    }catch (Exception ex){}
 *                 r.count++;
 *                 System.out.println("生产第" + r.count + "个");
 *                 //修改标志位,已经生产了,需要消费
 *                 r.flag = true;
 *                 //唤醒消费者线程
 *                 r.notify();
 *             }
 *         }
 */
