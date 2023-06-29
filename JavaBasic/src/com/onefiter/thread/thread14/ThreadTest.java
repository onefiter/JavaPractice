package com.onefiter.thread.thread14;

import java.util.concurrent.*;

public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池,线程的个数是2个
       ExecutorService  es =  Executors.newFixedThreadPool(2);
       //线程池管理对象service,调用方法啊submit提交线程的任务
        MyRunnable my = new MyRunnable();
        //提交线程任务,使用Callable接口实现类
        Future<String> future = es.submit(new MyCall());//返回接口类型 Future
        //接口的方法get,获取线程的返回值
        String str = future.get();
        System.out.println("str = " + str);

//        es.submit(my);
//        es.submit(my);
//        es.submit(my);
       // es.shutdown();//销毁线程池
    }
}
