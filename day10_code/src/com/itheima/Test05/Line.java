package com.itheima.Test05;
/*②定义类Line，包含空参、满参构造和以下成员变量
				基础班学习 basicClass（String 型）
				就业班学习 emplymentClass（String 型）
			生成所有成员变量set/get方法
			定义成员方法：void printLine(),要求：输出"练习路线，基础班学习：xxx，就业班学习：yyy",
				PS： xxx为变量basicClass值，yyy为变量emplymentClass值*/
public class Line {
    private String basicClass;
    private String emplymentClass;

    public Line() {
    }

    public Line(String basicClass, String emplymentClass) {
        this.basicClass = basicClass;
        this.emplymentClass = emplymentClass;
    }

    public String getBasicClass() {
        return basicClass;
    }

    public void setBasicClass(String basicClass) {
        this.basicClass = basicClass;
    }

    public String getEmplymentClass() {
        return emplymentClass;
    }

    public void setEmplymentClass(String emplymentClass) {
        this.emplymentClass = emplymentClass;
    }
    //定义成员方法：void printLine(),要求：输出"练习路线，基础班学习：xxx，就业班学习：yyy",
    //				PS： xxx为变量basicClass值，yyy为变量emplymentClass值*/
    void printLine(){
        System.out.println("练习路线,基础班学习:"+basicClass+"就业班学习"+emplymentClass);
    }
}
