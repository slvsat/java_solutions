package DoneProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {


    // Runtime: 14 ms
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            } else map.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() >= n) return pair.getKey();
        }
        throw new IllegalArgumentException("No solution");
    }


    // Runtime: 1 ms
    public int majorityElementSolutionSort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
