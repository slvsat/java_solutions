package leetcode;

public class MoveZeroes_283 {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int d = i; d < nums.length; d++) {
                    if (nums[d] != nums[i]) {
                        int temp = nums[d];
                        nums[d] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
    }

}
