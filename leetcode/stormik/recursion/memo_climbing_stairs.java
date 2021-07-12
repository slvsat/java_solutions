package leetcode.stormik.recursion;

import java.util.HashMap;

public class memo_climbing_stairs {

//    HashMap<Integer, Integer> map = new HashMap<>();
    int[] map = new int[46];

    public memo_climbing_stairs() {
//        map.put(0, 0);
//        map.put(1, 1);
//        map.put(2, 2);
//        map.put(3, 3);
        map[0] = 1;
        map[1] = 1;
        map[2] = 2;
        map[3] = 3;
        for (int i = 4; i < 46; i++) {
            map[i] = 0;
        }
    }

//    public int climbStairs(int n) {
//        if (n < 2) return 1;
//        if (!map.containsKey(n-1)) map.put(n-1, climbStairs(n-1));
//        if (!map.containsKey(n-2)) map.put(n-2, climbStairs(n-2));
//        int res = map.get(n-1) + map.get(n-2);
//        map.put(n, res);
//        return res;
//    }

    public int climbStairs(int n) {
        if (n < 2) return 1;
        if (map[n-1] == 0) map[n-1] = climbStairs(n-1);
        if (map[n-2] == 0) map[n-2] = climbStairs(n-2);
        int res = map[n-1] + map[n-2];
        map[n] = res;
        return res;
    }
}
