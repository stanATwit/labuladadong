package com.设计模式.状态模式;

/**
 * @Author stan
 * @Date 2021/10/13
 * @Describe
 * @Version 1.0
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        Startstate startstate = new Startstate();
        startstate.doAction(context);

        System.out.println( startstate.toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

    }
}
