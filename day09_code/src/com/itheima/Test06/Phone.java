package com.itheima.Test06;
/*2.定义类Phone，要求如下：
		包含空参、满参构造和以下成员变量
			品牌 brand
			价格 price
        生成所有成员变量set/get方法
        定义方法：void printPhone(),打印出Phone的具体信息,如"XXX手机,价格YYY"
		ps: XXX为Phone类的brand属性 yyy为Phone类的price属性*/
public class Phone {
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //定义方法：void printPhone(),打印出Phone的具体信息,如"XXX手机,价格YYY"
    //		ps: XXX为Phone类的brand属性 yyy为Phone类的price属性*/
    void printPhone(){
        System.out.println(brand+"手机,价格:"+price);
    }
}
