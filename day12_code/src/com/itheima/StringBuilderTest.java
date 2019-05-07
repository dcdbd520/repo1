package com.itheima;

public class StringBuilderTest {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                stringBuilder.append(arr[i]).append("]");
            }else {
                stringBuilder.append(arr[i]+", ");
            }
        }
        System.out.println(stringBuilder);
    }
}
