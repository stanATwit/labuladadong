package com.设计模式.简单工厂;

/**
 * 具体产品
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("我会画圆圈");
    }
}
