package leetcode.stormik.recursion;

import java.util.HashMap;

public class memo_fibonacci {

    HashMap<Integer, Integer> map = new HashMap<>();

    public memo_fibonacci() {
        map.put(0, 0);
        map.put(1, 1);
    }

    public int fib(int n) {
        if (n < 2) return n;
        if (!map.containsKey(n-2)) map.put(n-2, fib(n-2));
        if (!map.containsKey(n-1)) map.put(n-1, fib(n-1));
        int res = map.get(n-1) + map.get(n-2);
        map.put(n, res);
        return res;
    }

}

// F(6) = F(5) + f(4) = (F(4) + F(3)) + F(4)