package leetcode.stormik.easy;

public class StringCompression_443 {

    public int compress(char[] chars) {
        if (chars.length == 0) return 0;
        if (chars.length == 1) return 1;
        int i = 0;
        int cnt = 1;
        for (int j = 1; j < chars.length; j++) {
            if (chars[j] == chars[j-1]) {
                cnt++;
                if (j + 1 == chars.length) {
                    if (cnt != 1) {
                        chars[i] = chars[j-1];
                        i++;
                        for (int d = 0; d < Integer.toString(cnt).length(); d++) {
                            chars[i] = Integer.toString(cnt).charAt(d);
                            i++;
                        }
                    } else {
                        chars[i] = chars[j];
                        i++;
                    }
                    break;
                }
            }
            else {
                chars[i] = chars[j-1];
                i++;
                if (cnt != 1) {
                    for (int d = 0; d < Integer.toString(cnt).length(); d++) {
                        chars[i] = Integer.toString(cnt).charAt(d);
                        i++;
                    }
                    cnt = 1;
                }
                if (j + 1 == chars.length) {
                    chars[i] = chars[j];
                    i++;
                }
            }
        }
        return i;
    }

}
