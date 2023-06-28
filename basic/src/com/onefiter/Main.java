package com.onefiter;

import com.onefiter.innerClas;

/**
 * @author onefiter
 * @Date 2023/5/25
 */
public class Main {
    public static void main(String[] args) {

    }

    public static void testInnerClass() {
        new Compan
    }


    public static void testBasic() {
        Integer[] money = {
                100,
                0,
                null,
                500,
                -150,
        };

        System.out.println(money[0] + 10);


        Integer i1 = 88;
        Integer i2 = 88;
        Integer i3 = 888;
        Integer i4 = 888;

        // 不推荐
        System.out.println(i1 == i2); // true
        System.out.println(i3 == i4); // false

        // 推荐
        System.out.println(i1.equals(i2)); // true
        System.out.println(i3.equals(i4)); // true

    }


    public static void testMath() {
        Math.abs(-100);
    }


}
