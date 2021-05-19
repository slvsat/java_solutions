package leetcode.stormik.arrays101;

public class delete_removeDuplicates {

//    public int removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
//        if (nums.length == 1) return 1;
//        int point = 0;
//        int ind = 0;
//        int last = nums.length - 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[ind] == nums[i]) {
//                nums[i] = nums[last];
//                point++;
//            } else ind = i;
//        }
//
//        Arrays.sort(nums);
//        return nums.length - point;
//    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
