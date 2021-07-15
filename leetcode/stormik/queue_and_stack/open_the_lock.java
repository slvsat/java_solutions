package leetcode.stormik.queue_and_stack;

import java.util.*;

public class open_the_lock {

    public int openLock(String[] deadends, String target) {
        if (check(deadends, "0000")) return -1;
        Map<String, Integer> visited = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        q.add("0000");
        visited.put("0000", 0);
        while (!q.isEmpty()) {
            String curr = q.poll();
            if (curr.equals(target)) return visited.get(curr);
            for (int i = 0; i < 4; i++) {
                char[] up = curr.toCharArray();
                if (up[i] == '9') {
                    up[i] = '0';
                } else up[i]++;
                String upStr = new String(up);
                if (!visited.containsKey(upStr) && !check(deadends, upStr)) {
                    Integer before = visited.get(curr);
                    visited.put(upStr, before + 1);
                    q.add(upStr);
                }
                char[] down = curr.toCharArray();
                if (down[i] == '0') {
                    down[i] = '9';
                } else down[i]--;
                String downStr = new String(down);
                if (!visited.containsKey(downStr) && !check(deadends, downStr)) {
                    Integer before = visited.get(curr);
                    visited.put(downStr, before + 1);
                    q.add(downStr);
                }
            }
        }
        return -1;
    }

    public boolean check(String[] deadends, String current) {
        for (int i = 0; i < deadends.length; i++) {
            if (deadends[i].equals(current)) return true;
        }
        return false;
    }

}
