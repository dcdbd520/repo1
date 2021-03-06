package com.itheima.Test04;
/*④ 定义类IPhone，要求如下：
					继承抽象类 Phone，实现接口 Bluetooth
					构造方法包括：空参构造和满参构造方法(String)
					重写抽象方法：
						void btFunction()，要求：输出"支持WIFI功能"
						void playMusic(Song song)，要求：输出打印"XXX手机正在播放YYY唱的ZZZ"
				PS：XXX是Phone类中的 name属性值，YYY是Song 类中的 singer属性值，ZZZ是Song 类中的 name属性值*/
public class IPhone extends Phone implements Bluetooth{

    @Override
    public void btFunction() {
        System.out.println("支持WIFI功能");
    }

    @Override
    void playMusic(Song song) {
        System.out.println(getName()+"手机正在播放"+song.getSinger()+"唱的"+song.getName());
    }

    public IPhone() {
    }

    public IPhone(String name) {
        super(name);
    }
}
