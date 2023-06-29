package com.onefiter.thread.thread13;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        for(int x = 0 ; x < 100; x++){
            System.out.println(atomicInteger.getAndIncrement());

        }
    }
}
