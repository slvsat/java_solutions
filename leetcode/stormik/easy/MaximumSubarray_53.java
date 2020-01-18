package leetcode.stormik.easy;

public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {

        var maxCurrent = nums[0];
        var maxGlobal = nums[0];

        for (var i = 1; i < nums.length ; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;

    }

}
