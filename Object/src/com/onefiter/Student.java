package com.onefiter;

/**
 * author: onefiter
 * date: 2023/6/28
 */
public class Student {
    int number;
    int state;
    int score;

    // 用于每次打印Student对象的信息，代码复用，不必每次想打印时都再写一遍
    public void showMyInfo() {
        System.out.println("number=" + number + "\tstate=" + state + "\tscore=" + score);
    }
}
