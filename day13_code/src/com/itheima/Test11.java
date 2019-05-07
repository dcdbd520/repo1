package com.itheima;

/*十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。*/
public class Test11 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        method(arr,0,2);
    }

    public static <E> void method(E[] a, int b, int c) {
        E ex = a[b];
        a[b] = a[c];
        a[c] = ex;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
