import java.util.Arrays;

public class SingleNumber_136 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return -1;
        else if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i+1]) return nums[i];
            } else if (i == nums.length-1) {
                if (nums[i] != nums[i-1]) return nums[i];
            } else if (nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
        }
        return -1;
    }

    public int singleNumberBitManipulation(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a ^= num;
        }
        return a;
    }

}
