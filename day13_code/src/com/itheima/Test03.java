package com.itheima;

import java.util.ArrayList;

/*三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。*/
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(toArrayList(arr));
    }
    public static ArrayList<Integer> toArrayList(int[] ints){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }
        return list;
    }
}
