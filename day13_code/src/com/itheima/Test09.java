package com.itheima;

import java.util.ArrayList;

/*创建三个学生对象存入ArrayList集合中。
A：遍历集合遍历输出。
B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
*/
public class Test09 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, "男");
        Student s2 = new Student("李四", 20, "男");
        Student s3 = new Student("张三", 30, "女");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        A：遍历集合遍历输出
        for (Student student : list) {
            System.out.println(student.getName() + "," + student.getAge() + "," + student.getSex());
        }
//        B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        int a = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > a){
                index = i ;
                a = list.get(i).getAge();
            }
        }
        System.out.println("最大年级的学生是"+list.get(index).getName()+","+a+"岁");
//        改名字
        list.get(index).setName("小猪佩奇");
        System.out.println(list.get(index).getName()+list.get(index).getAge()+list.get(index).getSex());
    }
}
