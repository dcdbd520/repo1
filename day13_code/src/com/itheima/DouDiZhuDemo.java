package com.itheima;

import java.util.ArrayList;
import java.util.Collections;

/* 1.准备牌
        a.准备花色
        b.准备数值
        c.花色和数值组合 + 大小王 + 癞子  添加到牌盒
    2.洗牌
        傻否 -->  Collections操作集合的工具类 : shuffle(List<E> list) --> 随机打乱集合中元素的存储顺序
    3.发牌
        利用索引 % 3*/
public class DouDiZhuDemo {
    public static void main(String[] args) {
//         1.准备牌
//        a.准备花色
//        b.准备数值
//        c.花色和数值组合 + 大小王 + 癞子  添加到牌盒
        String[] flower = {"♠","♥","♣","♦"};
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
//         c.花色和数值组合 + 大小王 + 癞子  添加到牌盒
        ArrayList<String> poker = new ArrayList<>();
        for (int i = 0; i < flower.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(flower[i]+num[j]);
            }
        }
        poker.add("JOKER");
        poker.add("joker");
        poker.add("癞子");
//        2.洗牌
//        傻否 -->  Collections操作集合的工具类 : shuffle(List<E> list) --> 随机打乱集合中元素的存储顺序
        Collections.shuffle(poker);
//        3.发牌
//        利用索引 % 3*/
        ArrayList<String> 张三 = new ArrayList<>();
        ArrayList<String> 李四 = new ArrayList<>();
        ArrayList<String> 王五 = new ArrayList<>();
        ArrayList<String> 地主牌 = new ArrayList<>();
        for (int i = 0; i < poker.size()-4; i++) {
            if(i%3==0){
                张三.add(poker.get(i));
            }
            if(i%3==1){
                李四.add(poker.get(i));
            }
            if(i%3==2){
                王五.add(poker.get(i));
            }
        }
        地主牌.add(poker.get(poker.size()-4));
        地主牌.add(poker.get(poker.size()-3));
        地主牌.add(poker.get(poker.size()-2));
        地主牌.add(poker.get(poker.size()-1));
        System.out.println("地主牌 = " + 地主牌);
        System.out.println("王五 = " + 王五);
        System.out.println("李四 = " + 李四);
        System.out.println("张三 = " + 张三);
    }
}
