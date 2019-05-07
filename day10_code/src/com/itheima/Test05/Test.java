package com.itheima.Test05;
/*④ 定义测试类Test，在main方法实现以下功能：
		创建并初始化一个Student对象stu，调用方法 studying(Study sy)
		sy为Study的实现类，需要实现studyLine (Line line)抽象方法，实现要求：调用参数line的printLine()方法;
			示例如下：
				苍井空练习中
				好好练习,天天向上
				镜头拍烂,月薪百万
				学习路线,基础班学习:JAVASE,就业班学习:JAVAEE*/
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("苍井空");
        StudyImpl study = new StudyImpl();
        stu.studying(study);
    }
}
