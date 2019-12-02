package billcypher.easy;

public class GuessNumberHigherOrLower_374 {

    public int guessNumber(int n) {
        return guessNum(1, n);
    }

    private int guessNum(int l, int r) {
        int mid = l + (r - l)/2;
        // guess(int n) - is predefined by Leetcode function
        int res = guess(mid);
        if (res == -1) return guessNum(l, mid - 1);
        if (res == 1) return guessNum(mid + 1, r);
        return mid;
    }

}
