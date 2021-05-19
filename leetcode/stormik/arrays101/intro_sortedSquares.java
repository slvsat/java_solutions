package leetcode.stormik.arrays101;

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
