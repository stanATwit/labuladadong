package com.设计模式.状态模式;

/**
 * @Author stan
 * @Date 2021/10/13
 * @Describe
 * @Version 1.0
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
