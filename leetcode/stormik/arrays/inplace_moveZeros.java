package leetcode.stormik.arrays;

public class inplace_moveZeros {

    public void moveZeroes(int[] nums) {

        int lastNonZero = 0;

        // Placing non-zero elements in a row (if element is zero it's being skipped and pointer remains at the 0s position)
        // If element is not zero then we just place it in its current position again and increment lastNonZero var
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero++] = nums[i];
            }
        }

        // Since we placed all the elements we need to add zeros to the end (begin from lastNonZero)
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
