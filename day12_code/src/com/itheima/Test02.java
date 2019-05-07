package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sim.parse("2018-03-04");
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日");
        String str = s.format(parse);
        System.out.println(str);
    }
}
