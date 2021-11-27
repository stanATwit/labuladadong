package com.设计模式.状态模式;

/**
 * @Author stan
 * @Date 2021/10/13
 * @Describe
 * @Version 1.0
 */
public class Startstate implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
