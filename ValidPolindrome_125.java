public class ValidPolindrome_125 {

    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (a < 48 || a > 57 && a < 65 || a > 90 && a < 97 || a > 122) i++;
            else if (b < 48 || b > 57 && b < 65 || b > 90 && b < 97 || b > 122) j--;
            else if (a != b) {
                if (a > 64 && a < 91) a += 32;
                if (b > 64 && b < 91) b += 32;
                if (Math.abs(a - b) != 0) return false;
                i++;
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
