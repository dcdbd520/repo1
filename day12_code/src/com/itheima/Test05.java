package com.itheima;
/*九、请使用代码实现
分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。
*/
public class Test05 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        String str = "1";
        for (int i = 0; i < 100000; i++) {
            str+="1";
        }
        long tE = System.currentTimeMillis();
        System.out.println(tE-t);
        StringBuilder strB = new StringBuilder();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strB.append("1");
        }
        String NStr = strB.toString();
        long tE2 = System.currentTimeMillis();
        System.out.println(tE2-t1);
    }
}
