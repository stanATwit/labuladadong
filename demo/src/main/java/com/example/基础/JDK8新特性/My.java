package com.example.基础.JDK8新特性;

/**
 * @Author stan
 * @Date 2021/10/8
 * @Describe  接口静态方法演示
 * @Version 1.0
 */
public class My implements MyStaticInterface {
    public static void main(String[] args) {
        MyStaticInterface.method();
    }
}
