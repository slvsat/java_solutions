package leetcode.stormik.arrays101;

import java.util.HashMap;
import java.util.Map;

public class search_nAndItsDouble {

    public boolean checkIfExist(int[] arr) {

        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            cache.put(arr[i], i);
        }

        for (int j = 0; j < arr.length; j++) {
            Integer temp = cache.get(arr[j] * 2);
            if (temp != null && temp != j) {
                return true;
            }
        }

        return false;
    }

}
