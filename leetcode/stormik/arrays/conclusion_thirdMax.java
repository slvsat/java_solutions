package leetcode.stormik.arrays;

import java.util.Arrays;

public class conclusion_thirdMax {

    public int thirdMax(int[] nums) {
        if (nums.length < 3) {
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) max = nums[i];
            }
            return max;
        }

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int third = 0;
        int number = nums[nums.length-1];

        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] != nums[i+1]) third++;
            if (third == 2) {
                number = nums[i];
                break;
            }
        }
        return number;
    }

}
