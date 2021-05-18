package leetcode.stormik.arrays;

public class inplace_removeElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int l = 0;
        int r = nums.length-1;

        while(l <= r) {
            if (nums[r] != val) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            } else {
                r--;
            }
        }

        return l;
    }

}
