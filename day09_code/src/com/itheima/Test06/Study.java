package com.itheima.Test06;
/*1.定义抽象类Study，要求如下：
		包含空参、满参构造和以下成员方法
			定义抽象方法：void stu(Phone p);
			定义普通方法: void info1()  打印"好好学习,天天向上"
			定义普通方法: void info2()  打印"键盘敲烂,月薪过万"*/
public abstract class Study {
    public Study() {
    }
    abstract void stu(Phone p);
    void info1(){
        System.out.println("好好学习,天天向上");
    }
    void info2(){
        System.out.println("键盘敲烂,月薪过万");
    }
}
