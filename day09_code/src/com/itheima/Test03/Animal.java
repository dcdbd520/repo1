package com.itheima.Test03;
/*  定义一个接口Animal,包含:
			1.抽象方法:run()
			2.默认方法: sleep(),输出"动物会休息"*/
public interface Animal {
    public void run();
    public default void sleep(){
        System.out.println("动物会休息");
    }
}
