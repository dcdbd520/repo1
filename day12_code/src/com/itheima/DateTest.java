package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期(XXXX年XX月XX日)");
        String birth = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sdf.parse(birth);
        long birthTime = parse.getTime();
        Date n = new Date();
        long now = n.getTime();
        System.out.println("您活了"+((now-birthTime)/(1000L*60*60*24))+"天");
    }
}
