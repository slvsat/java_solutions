package leetcode.stormik.easy;

public class MinCostClimbingStairs_746 {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        for (int i = 0; i < cost.length; i++) {
            dp[i] = Math.min((i - 2 < 0 ? 0 : dp[i-2]) + cost[i], (i - 1 < 0 ? 0 : dp[i-1]) + cost[i]);
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

}
