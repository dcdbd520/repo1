package com.itheima;

import java.util.ArrayList;
import java.util.Collections;

public class ZhaJinHua {
    public static void main(String[] args) {
        String[] flower = {"♠", "♥", "♣", "♦"};
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//        组合牌,放入牌盒
        ArrayList<String> poker = new ArrayList<>();
        for (int i = 0; i < flower.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(flower[i] + num[j]);
            }
        }
//        洗牌
        Collections.shuffle(poker);
//        发牌
        ArrayList<String> 张三 = new ArrayList<>();
        ArrayList<String> 李四 = new ArrayList<>();
        ArrayList<String> 王五 = new ArrayList<>();
        for (int i = 0; i < poker.size() - 43; i++) {
            if (i % 3 == 0) {
                张三.add(poker.get(i));
            }
            if (i % 3 == 1) {
                李四.add(poker.get(i));
            }
            if (i % 3 == 2) {
                王五.add(poker.get(i));
            }
        }
        System.out.println("王五 = " + 王五);
        System.out.println("李四 = " + 李四);
        System.out.println("张三 = " + 张三);
    }
}
