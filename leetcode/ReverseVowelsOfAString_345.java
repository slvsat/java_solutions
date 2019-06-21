package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfAString_345 {

    private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public String reverseVowels(String s) {
        if (s.length() < 2) return s;
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right) {
            while (!vowels.contains(chars[left])) {
                if (left < right)  left++;
                else break;
            }
            while (!vowels.contains(chars[right])) {
                if (right > left) right--;
                else break;
            }
            if (vowels.contains(chars[left]) && vowels.contains(chars[right])) {
                chars[left] = s.charAt(right);
                chars[right] = s.charAt(left);
                left++;
                right--;
            } else {
                break;
            }
        }
        return new String(chars);
    }

}
