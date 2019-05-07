package com.itheima.Test06;
/*
	3.定义类Student，包含空参、满参构造和以下成员变量
        姓名 name（String 型）
		年龄 age（int型）
        生成所有成员变量set/get方法
		定义成员方法：void studying(Learn le)，要求：
			1.输出“yyy岁的xxxx学习中”，
			2.然后在方法内通过传入的Learnd对象le依次调用info1()，info2(),stu(Phone p)方法
		ps: yyy为Student类中的age方法,xxxx为Student类中的name方法,
		ps: Learn继承于Study类，需要实现stu(Phone p)抽象方法，实现要求：调用参数p的printPhone()方法;*/
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //定义成员方法：void studying(Learn le)，要求：
    //			1.输出“yyy岁的xxxx学习中”，
    //			2.然后在方法内通过传入的Learnd对象le依次调用info1()，info2(),stu(Phone p)方法
    //		ps: yyy为Student类中的age方法,xxxx为Student类中的name方法,
    //		ps: Learn继承于Study类，需要实现stu(Phone p)抽象方法，实现要求：调用参数p的printPhone()方法;*/
    void studying(Learn le){
        System.out.println(age+"岁的"+name+"学习中");
        le.info1();
        le.info2();
        Phone p = new Phone("华为",1999);
        le.stu(p);

    }

}
