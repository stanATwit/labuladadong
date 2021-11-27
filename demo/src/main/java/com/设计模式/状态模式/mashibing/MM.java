package com.设计模式.状态模式.mashibing;

/**
 * @Author stan
 * @Date 2021/10/19
 * @Describe
 * @Version 1.0
 */
public class MM {
    String name;
    MMState state;

    public void smile(){
        state.smile();
    }
    public void cry(){
        state.cry();
    }
    public void say(){
        state.say();
    }
}
