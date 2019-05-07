package com.itheima;
/*十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素*/
public class Test12 {
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5"};
        method(arr);
    }
    public static <E> void method(E[] a){
        for (int min = 0,max = a.length-1; min < max; min++,max--) {
            E ex = a[min];
            a[min] = a[max];
            a[max] = ex;
        }
        for (E e : a) {
            System.out.println(e);
        }
    }
}
