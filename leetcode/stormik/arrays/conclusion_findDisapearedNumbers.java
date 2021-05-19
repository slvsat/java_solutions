package leetcode.stormik.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class conclusion_findDisapearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();

        int i = 0;
        while(i < nums.length) {
            if (nums[i] == -1) i++;
            else {
                if (nums[nums[i]-1] != -1) {
                    int ind = nums[i]-1;
                    nums[i] = nums[ind];
                    nums[ind] = -1;
                } else i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int d = 0; d < nums.length; d++) {
            if (nums[d] != -1) res.add(d+1);
        }
        return res;
    }

}
