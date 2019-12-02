package billcypher.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2_219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> inds = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (inds.containsKey(nums[i])) {
                if (i - inds.get(nums[i]) <= k) return true;
            }
            inds.put(nums[i], i);
        }
        return false;
    }

}
