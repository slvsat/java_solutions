package leetcode.stormik;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList_1313 {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while(2 * i + 1 < nums.length) {
            int a = nums[2*i];
            int b = nums[2 * i + 1];
            while(a > 0) {
                a--;
                result.add(b);
            }
            i++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
