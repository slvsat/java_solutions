package leetcode.stormik.medium;

public class LongestPalindromicSubstring_5 {

    public String longestPalindrome(String s) {
        if (s.length() < 1) return "";
        int n = s.length();
        int longest = 0, start = 0, end = 0;
        boolean[][] palindrom = new boolean[n][n];

        for (int j = 0; j < n; j++) {
            palindrom[j][j] = true;
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1])) {
                    palindrom[i][j] = true;
                    if (j-i+1 > longest) {
                        longest = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }

}
