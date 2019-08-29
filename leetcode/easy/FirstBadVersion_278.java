package leetcode.easy;

public class FirstBadVersion_278 {

    public int firstBadVersion(int n) {
        if (n == 0) return 1;
        return badVersion(1, n);
    }

    private int badVersion(int l, int r) {
        if (l == r) return r;
        if (l > r) return l;
        int middle = l + (r-l)/2;
        boolean mid = isBadVersion(middle);
        if (middle == l && mid) return l;
        if (mid) {
            if (isBadVersion(middle-1)) return badVersion(l, middle - 1);
            else return middle;
        }
        else return badVersion(middle + 1, r);
    }

}
