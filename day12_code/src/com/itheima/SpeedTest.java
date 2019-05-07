package com.itheima;

public class SpeedTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis());
    }
}
