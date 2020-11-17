package leetcode.stormik.easy;

class ReverseInteger_7 {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0) {
            int mod = x % 10;
            x = x / 10;
            if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && mod > 7)) return 0;
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE/10 && mod < -8)) return 0;
            ans = ans * 10 + mod;
        }
        return ans;
    }
}
