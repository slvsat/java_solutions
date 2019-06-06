package leetcode;

import java.util.Arrays;

public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) return true;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) return true;
        return false;
    }

}
