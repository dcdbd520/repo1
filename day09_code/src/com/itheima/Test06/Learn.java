package com.itheima.Test06;
/*ps: Learn继承于Study类，需要实现stu(Phone p)抽象方法，实现要求：调用参数p的printPhone()方法;*/
public class Learn extends Study {
    @Override
    void stu(Phone p) {
        p.printPhone();
    }
}
