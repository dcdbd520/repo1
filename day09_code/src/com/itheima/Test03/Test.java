package com.itheima.Test03;

/*在测试类中定义如下方法:
		public static void printAnimal(Animal a){}
		要求在方法中编写代码实现如下功能:
			在主方法中:
			1. Animal b = new Dog();
				调用方法printAnimal()传入b对象,能在控制台输出:
					如脱缰的野狗一样奔跑
					动物会休息
					狗吃屎

			1. Animal c = new Cat();
				调用方法printAnimal()传入c对象,能在控制台输出:
					奔跑的猫毛都被撸秃了
					动物会休息
					猫抓老鼠*/
public class Test {
    public static void main(String[] args) {
        Animal b = new Dog();
        printAnimal(b);
        Animal c = new Cat();
        printAnimal(c);
    }
    public static void printAnimal(Animal a){
        a.run();
        a.sleep();
        if (a instanceof Dog){
            Dog d = (Dog) a;
            d.eat();
        }
        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }
    }
}
