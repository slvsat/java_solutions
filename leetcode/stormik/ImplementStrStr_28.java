package leetcode.stormik;

public class ImplementStrStr_28 {

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        if (haystack.length() == 0 && needle.length() != 0) return -1;
        else if (haystack.length() == 0 && needle.length() == 0) return 0;
        if (needle.length() == 0) return 0;
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(j) == haystack.charAt(i)) {
                if (j + 1 == needle.length()) {
                    return i - j;
                }
                j++;
            } else {
                i = i - j;
                j = 0;
            }
        }
        return -1;
    }

}
