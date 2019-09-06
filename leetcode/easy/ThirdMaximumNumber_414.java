package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThirdMaximumNumber_414 {

    public int thirdMax(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        int previousMax = nums[nums.length-1];
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] != previousMax) {
                previousMax = nums[i];
                count++;
            }
            if (count == 3) return previousMax;
        }
        return nums[nums.length-1];
    }

}
