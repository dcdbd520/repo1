package com.itheima;

import java.util.ArrayList;

/*六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。*/
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("你好");
        System.out.println(listTest(objects));
    }
    public static boolean listTest(ArrayList<String> al){
        return al.isEmpty() ;
    }
}
