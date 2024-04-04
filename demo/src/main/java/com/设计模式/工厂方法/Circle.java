package com.设计模式.工厂方法;

/**
 * 具体产品
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("我会画圆圈");
    }
}
