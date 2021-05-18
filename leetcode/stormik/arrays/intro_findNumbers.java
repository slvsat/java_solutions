package leetcode.stormik.arrays;

public class intro_findNumbers {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int tempCnt = 0;
            int number = nums[i];
            while(number!=0) {
                number = number / 10;
                tempCnt++;
            }
            if (tempCnt%2==0) count++;
        }
        return count;
    }

}
