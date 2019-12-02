package billcypher.easy;

public class ArrangingCoins_441 {

    public int arrangeCoins(int n) {
        // Math ax^2 + bx + c = n
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
        //return getRow(n, 0, 0);
    }

    // Java doesn't have tail recursion so this solution will trigger StackOverflow error
//    private int getRow(int n, int sum, int current) {
//        if (n == 1) return 1;
//        if (n < sum) return current;
//        else if (n == sum) return current;
//        else {
//            current++;
//            sum += current;
//        }
//        return n > sum ? getRow(n, sum, current) : current-1;
//    }

}
