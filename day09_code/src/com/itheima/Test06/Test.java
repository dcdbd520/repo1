package com.itheima.Test06;
/*定义测试类中,创建并初始化一个Student 对象 s, 调用studying(Learn le)方法,打印出如下语句:
		15岁的关晓彤学习中
		好好学习,天天向上
		键盘敲烂,月薪过万
		华为手机,价格1999*/
public class Test {
    public static void main(String[] args) {
        Student s = new Student("关晓彤",19);
        Learn le = new Learn();
        s.studying(le);
    }
}
