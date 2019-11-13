package leetcode.easy;

import java.util.Arrays;

public class FindTheDifference_389 {

    public char findTheDifference(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        char res = '\0';
        for (int i = 0; i < second.length; i++) {
            if (i < first.length) {
                if (first[i] != second[i]) {
                    res = second[i];
                    break;
                }
            } else {
                res = second[i];
                break;
            }
        }
        return res;
    }
}
