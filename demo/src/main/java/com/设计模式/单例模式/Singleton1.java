package com.设计模式.单例模式;

/**
 * 懒汉式单例模式，线程安全
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){
        //私有构造函数，防止外部实例化
    }
    //锁的范围太广
    public static synchronized Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

    //使用双重检查提高性能
    public static Singleton1 getInstance1(){
        if(instance == null){
            synchronized (Singleton1.class){
                if(instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
