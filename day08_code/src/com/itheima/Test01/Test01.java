package com.itheima.Test01;
/*定义一个字符串s = "Hello-World",利用API完成如下小需求
		1.判断字符串s,与字符串"World"是否相等,并打印出来.
		2.用程序得到字符串"Wo",在字符串s中的起始索引.
		3.得到s中,3号索引对应的字符,打印到控制台上
		4.得到s的长度,打印在控制台上.
		5.获得s中的"Hell"字符串,打印在控制台上.
		6.获得s中的"orld"字符串,打印在控制台上.
		7.将字符串s中的所有o替换为*号.打印在控制台上
		8.将字符串s切割成"Hello"和"World"两个字符串,打印在控制台上
		9.将字符串s变为字符数组,遍历数组将每个字符打印在控制台上*/
public class Test01 {
    public static void main(String[] args) {
        String s="Hello-World";
        boolean a="s".contains("World");
        System.out.println(a);
        int b=s.indexOf("Wo");
        System.out.println(b);
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(7,11));
        System.out.println(s.replace('o','*'));
        String[] q= s.split("-");
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }
        //9.将字符串s变为字符数组,遍历数组将每个字符打印在控制台上*/
        char[] p=s.toCharArray();
        for (int i = p.length - 1; i >= 0; i--) {
            System.out.print(p[i]+" ");
        }
		    System.out.print("再次修改");
    }
}
