package com.itheima;

import java.util.ArrayList;

/*八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。*/
public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        System.out.println(listTest(list,9));
    }
    public static int listTest(ArrayList<Integer> al, Integer s){
        int a = al.indexOf(s);
        return a;
    }
}
