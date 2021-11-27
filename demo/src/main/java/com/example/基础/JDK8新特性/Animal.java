package com.example.基础.JDK8新特性;

/**
 * @Author stan
 * @Date 2021/10/8
 * @Describe
 * @Version 1.0
 */
public interface Animal {
    void eat();

    default void run(){
        System.out.println("我会跑");
    }
    default void fly(){
        System.out.println("我会飞");
    }

}



