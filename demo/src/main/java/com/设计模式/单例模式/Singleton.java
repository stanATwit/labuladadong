package com.设计模式.单例模式;

/**
 * 饿汉式单例模式，线程安全
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){
        //私有构造函数，防止外部实例化
    }

    public static Singleton getInstance(){
        return instance;
    }
}
