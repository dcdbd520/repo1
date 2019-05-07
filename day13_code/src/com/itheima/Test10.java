package com.itheima;

import java.util.ArrayList;
import java.util.Random;

/*十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。*/
public class Test10 {
    public static void main(String[] args) {
//        创建数组
        int[] arr = new int[10];
//        创建随机数生成器
        Random r = new Random();
//        遍历放入数组,创建集合
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100)+1;
            if (arr[i]>=10){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
