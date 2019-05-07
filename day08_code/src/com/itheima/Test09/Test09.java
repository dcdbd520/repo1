package com.itheima.Test09;

import java.util.ArrayList;

/*a.定义方法public static ArrayList<String>  handleString(String [] arr，String str)；
		实现以下功能：
			遍历arr，将数组中包含参数str的元素,含有str的部分替换为*, 存入另一个集合中,将新集合返回；
	b.在main方法中完成以下要求：
		1)定义一个String数组arr，数组元素有："beijing", "shanghai", "tianjin", "chongqing"；
		2)调用handleString方法传入arr数组和字符串”a”，输出返回的集合中所有元素；

	示例如下：
			控制台输出元素如下:
			[sh*ngh*i,ti*njin]*/
public class Test09 {
    public static void main(String[] args) {
        String[] arr ={"beijing","shanghai","tianjin","chongqing"};
        ArrayList list=handleString(arr,"a");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static ArrayList<String> handleString(String[] arr, String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains(str)){
                String replace=arr[i].replace(str,"*");
                list.add(replace);
            }

        }
        return list;
    }
}

