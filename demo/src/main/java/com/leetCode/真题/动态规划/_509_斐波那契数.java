package com.leetCode.真题.动态规划;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author stan
 * @Date 2021/11/13
 * @Describe  https://leetcode-cn.com/problems/fibonacci-number/
 * @Version 1.0
 */
public class _509_斐波那契数 {
    Map<Integer,Integer> map = new HashMap();

    /**
     * 自顶向下: 备忘录算法
     * @param n:
     * @return: int
     */
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        if(map.containsKey(n)){
            return (int)map.get(n);
        }
        int m = fib(n-1)+fib(n-2);
        map.put(n,m);
        return m;
    }

    /**
     * 自底向上，动态规划思路 dp 数组的迭代解法
     * @param n:
     * @return: int
     */
    public int fib2(int n) {
        if(n==0){
            return 0;
        }
        int[] dp = new int[n+1];
        /*base case*/
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++ ){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    /**
     * 优化空间复杂度 空间复杂度优化为O(1)
     * @param n:
     * @return: int
     */
    public int fib3(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int pre = 1, cur =1;
        for(int i = 3; i <= n; i++){
            int sum = pre+cur;
            pre = cur;
            cur = sum;
        }
        return cur;
    }
}
