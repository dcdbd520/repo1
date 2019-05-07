package com.itheima.Test02;

import java.util.Scanner;

/*第二题:
	1.键盘录入一个字符串
	2.统计录入的字符串中的大写字母,小写字母,数字分别有多少个.*/
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int countA=0;
        int countB=0;
        int countC=0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A'&&chars[i]<='Z'){
                countA++;
            }else if(chars[i]>='a'&&chars[i]<='z'){
                countB++;
            }else {
                countC++;
            }
        }
        System.out.println("大写字母有"+countA+"小写字母有"+countB+"数字有"+countC);
    }
}
