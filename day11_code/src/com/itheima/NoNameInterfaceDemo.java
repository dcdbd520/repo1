package com.itheima;

import java.lang.reflect.Method;

public class NoNameInterfaceDemo {
    public static void main(String[] args) {
        interA interA = new interA() {
            @Override
            public void Method() {
                System.out.println("匿名内部类实现父接口中的Method方法");
            }

            @Override
            public void show() {
                System.out.println("匿名内部类实现父接口中的show方法");
            }

            @Override
            public void function() {
                System.out.println("匿名内部类实现父接口中的function方法");
            }
        };
        interA.function();
        interA.show();
        interA.Method();
    }
}
interface interA{
    public abstract void Method();
    public abstract void show();
    public abstract void function();
}
