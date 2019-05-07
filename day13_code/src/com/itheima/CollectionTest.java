package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
//        创建集合对象
        Collection<String> con = new ArrayList<String>();
//        加入元素
        con.add("张三");
        con.add("李四");
        con.add("王五");
//        创建迭代器
        Iterator<String> it = con.iterator();
//        使用迭代器遍历集合
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
