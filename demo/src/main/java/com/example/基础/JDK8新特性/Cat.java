package com.example.基础.JDK8新特性;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author stan
 * @Date 2021/10/8
 * @Describe
 * @Version 1.0
 */
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("我是猫，我也要吃东西");
    }
}
