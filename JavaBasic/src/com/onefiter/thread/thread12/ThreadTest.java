package com.onefiter.thread.thread12;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class ThreadTest {

    public static void main(String[] args) {
        Resource r = new Resource();
        //接口实现类,生产的,消费的
        Produce produce = new Produce(r);
        Customer customer = new Customer(r);
        //创建线程
        new Thread(produce).start();
        new Thread(produce).start();
        new Thread(produce).start();
        new Thread(produce).start();
        new Thread(produce).start();
        new Thread(produce).start();
        new Thread(customer).start();
        new Thread(customer).start();
        new Thread(customer).start();
        new Thread(customer).start();
        new Thread(customer).start();
        new Thread(customer).start();
    }
}
