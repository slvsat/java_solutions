package leetcode.stormik.recursion;

public class reverse_string {

    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }

    public char[] reverse(char []s, int l, int r) {
        if (l >= r) return s;
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        return reverse(s, l+1, r-1);
    }
}
