package leetcode.stormik.easy;

public class HouseRobber_198 {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            dp[i] = Math.max((i - 2 < 0 ? 0 : dp[i-2]), (i - 3 < 0 ? 0 : dp[i-3])) + nums[i];
        }
        return Math.max(dp[nums.length-1], dp[nums.length-2]);
    }

}
