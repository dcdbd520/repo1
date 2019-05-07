package com.itheima.Test04;
/*⑤ 定义测试类Test，在main方法实现以下功能：
			   创建并初始化一个IPhone 对象phone和一个Song 对象s，调用phone的 btFunction()、connecting()和playMusic(Song song)方法,打印如下:
				支持WIFI功能
				可以连接WIFI
				华为手机正在播放周杰伦唱的菊花残*/
public class Test {
    public static void main(String[] args) {
        IPhone phone=new IPhone("华为");
        Song s=new Song("周杰伦","菊花残");
        phone.btFunction();
        phone.connecting();
        phone.playMusic(s);
    }
}
