package com.itheima.Test05;


import java.util.Random;
import java.util.Scanner;

/*1.键盘录入一个字符串
	2.从字符串中随机获取3次字符,将获取的3个字符组成一个新的字符串.打印到控制台上*/
public class RandomTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s = sc.nextLine();
        Random r = new Random();
        String str="";
        for (int i = 0; i < 3; i++) {
            int index=r.nextInt(s.length());
            char c = s.charAt(index);
            str+=c;

        }
        System.out.println(str);
    }
}


