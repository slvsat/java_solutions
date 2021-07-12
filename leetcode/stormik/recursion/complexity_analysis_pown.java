package leetcode.stormik.recursion;

public class complexity_analysis_pown {

    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE) {
            n = n + 1;
            double res = helper(x, Math.abs(n));
            return 1/(res * x);
        }
        double res = helper(x, Math.abs(n));
        return n < 0 ? 1/res : res;
    }

    public double helper(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        double odd = 0;
        // Bin pow
        if (n % 2 == 0) {
            odd = myPow(x, n/2);
            return odd * odd;
        }
        return myPow(x, n-1) * x;
    }

}
