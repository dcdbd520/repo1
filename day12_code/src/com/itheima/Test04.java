package com.itheima;
/*七、用程序判断2018年2月14日是星期几。
**/
import java.util.Calendar;

public class Test04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,14);
        int year = c.get(Calendar.YEAR);
        int M = c.get(Calendar.MONTH);
        int D = c.get(Calendar.DATE);
        int W = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+"年"+M+"月"+D+"日是星期"+(W-1));
    }
}
