package leetcode.stormik.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int cnt = 0;
        for (int j = s.length() - 1; j>=0; j--) {
            if (s.charAt(j) != ' ') {
                for (int i = j; i >= 0; i--) {
                    if (s.charAt(i) == ' ') {
                        return cnt;
                    } else {
                        cnt++;
                    }
                }
                return cnt;
            }
        }
        return cnt;
    }

}
