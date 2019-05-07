package com.itheima.Test07;

import java.util.Scanner;

/*分析以下需求，并用代码实现
	1.定义如下方法public static String getPropertyGetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户传入的参数，返回值类型为String类型，返回值为对应的get方法的名字
			(2)如：用户调用此方法时传入参数为"name",该方法的返回值为"getName"
								   传入参数为"age",该方法的返回值为"getAge"

	2.定义如下方法public static String getPropertySetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户传入的参数，返回值类型为String类型，返回值为对应的set方法的名字
			(2)如：用户调用此方法时传入参数为"name",该方法的返回值为"setName"
								   传入参数为"age",该方法的返回值为"setAge"*/
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        String s = sc.nextLine();
        System.out.println( getPropertyGetMethodName(s));
    }
    public static String getPropertyGetMethodName(String property){
        char first=property.charAt(0);
        //String有字母转换大小写的方法
        String firstU=(first+"").toUpperCase();
       String s="get"+firstU+property.substring(1);
        return s;
    }
}
