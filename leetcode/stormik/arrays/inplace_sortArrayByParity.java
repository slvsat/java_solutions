package leetcode.stormik.arrays;

public class inplace_sortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        int l = 0;
        int r = nums.length-1;

        while(l != r) {
            if (nums[r] % 2 == 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            } else {
                r--;
            }
        }
        return nums;
    }

    public int[] sortArrayByParityUsingFor(int[] nums) {

        int lastIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[lastIndex];
                nums[lastIndex] = nums[i];
                nums[i] = temp;
                lastIndex++;
            }
        }
        return nums;

    }

}
