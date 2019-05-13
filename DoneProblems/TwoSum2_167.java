package DoneProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2_167 {

    // Runtime: 2 ms
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> resMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (resMap.containsKey(complement)) {
                return new int[]{ resMap.get(complement), i + 1 };
            }
            resMap.put(numbers[i], i + 1);
        }
        throw new IllegalArgumentException("No solutions");
    }


    // Runtime: 0 ms
    public int[] twoSumTwoPointers(int[] numbers, int target) {
        int[] indice = new int[2];
        if (numbers == null || numbers.length < 2) return indice;

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int v = numbers[left] + numbers[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right--;
            } else {
                left++;
            }
        }
        return indice;
    }

}
