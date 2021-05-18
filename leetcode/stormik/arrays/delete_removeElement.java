package leetcode.stormik.arrays;

public class delete_removeElement {

    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) return 0;
        int pointer = nums.length-1;
        int inPlaceOf = 0;
        while(inPlaceOf <= pointer) {
            if (nums[inPlaceOf] == val) {
                nums[inPlaceOf] = nums[pointer];
                pointer--;
            } else {
                inPlaceOf++;
            }
        }

        return pointer+1;

    }

}
