package com.itheima;

import java.util.ArrayList;

/*五、定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。*/
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(listTest(list,"Hello"));
    }
    public static boolean listTest(ArrayList<String> al, String s){
        if (al.contains(s)){
            return true;
        }
        return false;
    }
}
