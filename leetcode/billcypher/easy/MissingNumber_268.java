package billcypher.easy;

import java.util.Arrays;

public class MissingNumber_268 {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++) {
            if (i != nums[i]) return i;
        }
        return nums[nums.length-1] + 1;
    }

}
