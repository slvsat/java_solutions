package leetcode.stormik.arrays;

import java.util.Arrays;

public class intro_sortedSquares {

    public int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
