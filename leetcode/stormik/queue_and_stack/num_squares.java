package leetcode.stormik.queue_and_stack;

import java.util.LinkedList;
import java.util.Queue;

public class num_squares {

    public int numSquares(int n) {
        int[] map = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(!q.isEmpty()) {
            Integer curr = q.poll();
            for (int i = 100; i >= 1; i--) {
                int temp = curr + i*i;
                if (temp > n) continue;
                if (temp == n) return map[curr] + 1;
                if (map[temp] == 0) map[temp] = map[curr] + 1;
                q.add(temp);
            }
        }
        return -1;
    }

}
