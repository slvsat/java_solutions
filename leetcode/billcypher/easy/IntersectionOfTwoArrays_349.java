package billcypher.easy;

import java.util.*;

public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] much, less;
        if (nums1.length > nums2.length) {
            much = nums1;
            less = nums2;
        } else {
            much = nums2;
            less = nums1;
        }
        Arrays.sort(much);
        Arrays.sort(less);
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < less.length; i++) {
            for (int j = i; j < much.length; j++) {
                if (less[i] == much[j]) {
                        result.add(less[i]);
                        break;
                }
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}