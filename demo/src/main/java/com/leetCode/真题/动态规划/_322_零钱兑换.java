package com.leetCode.真题.动态规划;

import java.util.Arrays;

/**
 * @Author stan
 * @Date 2021/11/15
 * @Describe https://leetcode-cn.com/problems/coin-change/submissions/
 * @Version 1.0
 */
public class _322_零钱兑换 {
    int[] memo;
    /**
     * 自顶向下
     * @param coins:
     * @param amount:
     * @return: int
     */
    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo,-666);
        return dp(coins,amount);
    }

    public int dp(int[] coins, int amount){
        if(amount == 0){
            return 0;
        }
        if(amount < 0 ){
            return -1;
        }
        if(memo[amount]!=-666){
            return memo[amount];
        }
        int res = Integer.MAX_VALUE;
        for(int coin : coins){
            int subProblem = dp(coins,amount-coin);
            // 子问题无解则跳过
            if(subProblem == -1){
                continue;
            }
            res = Math.min(res,1+subProblem);
        }
        memo[amount] = res == Integer.MAX_VALUE ?-1:res;
        return memo[amount];
    }
    /**
     * dp数组自底向上 dp 数组的迭代解法
     * PS：为啥 dp 数组初始化为 amount + 1 呢，因为凑成 amount 金额的硬币数最多只可能等于 amount（全用 1 元面值的硬币），
     * 所以初始化为 amount + 1 就相当于初始化为正无穷，便于后续取最小值。为啥不直接初始化为 int 型的最大值 Integer.MAX_VALUE 呢？
     * 因为后面有 dp[i - coin] + 1，这就会导致整型溢出。
     * @param coins:
     * @param amount:
     * @return: int
     */
    public int coinChange1(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        //base case
        dp[0]= 0;
        //最外层遍历全部整个数组
        for(int i= 0; i < dp.length; i++){
            //内内层 for 循环在求所有选择的最小值
            for(int coin: coins){
                // 子问题无解，跳过
                if(i-coin<0){
                    continue;
                }
                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return dp[amount] == amount+1?-1:dp[amount];
    }
}
