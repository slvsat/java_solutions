package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString_387 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            res.put(s.charAt(i), res.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (res.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

}
