package com.onefiter.thread.thread14;

import java.util.concurrent.Callable;

public class MyCall implements Callable<String> {
    public String call() throws Exception{
        return "返回字符串";
    }
}
