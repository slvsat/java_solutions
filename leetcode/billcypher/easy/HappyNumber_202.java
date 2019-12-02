package billcypher.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

    public boolean isHappy(int n) {
        return isHappyRec(n, new HashSet<>());
    }

    private boolean isHappyRec(int n, Set<Integer> was) {
        if (was.contains(n)) return false;
        else was.add(n);
        if (n == 0) return false;
        if (n == 1) return true;
        int sum = 0;
        int first;
        while(n > 0) {
            first = (int)Math.pow(n % 10, 2);
            n /= 10;
            sum += first;
        }
        return isHappyRec(sum, was);
    }

    private boolean isHappyUntilOne(int n) {
        while(n >= 10) {
            int temp = 0;
            int sum = 0;
            while(n >= 10) {
                temp = n % 10;
                n /= 10;
                sum += temp*temp;
            }
            n = sum + n*n;
        }

        if (n == 1 || n == 7) return true;
        else return false;
    }

}
