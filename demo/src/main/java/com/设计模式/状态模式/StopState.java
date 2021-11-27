package com.设计模式.状态模式;

/**
 * @Author stan
 * @Date 2021/10/13
 * @Describe
 * @Version 1.0
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Player is in Stop state");
    }

    public String toString(){
        return "Stop state";
    }
}
