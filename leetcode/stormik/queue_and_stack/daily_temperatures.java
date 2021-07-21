package leetcode.stormik.queue_and_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class daily_temperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> prom = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (!prom.isEmpty()) {
                int size  = prom.size();
                while(size != 0) {
                    Integer last = prom.pop();
                    if (temperatures[last] < temperatures[i]) result[last] = i - last;
                    else if (temperatures[last] >= temperatures[i]) {
                        prom.add(last);
                        break;
                    }
                    size--;
                }
                prom.push(i);
            } else prom.push(i);
        }
        return result;
    }

}
