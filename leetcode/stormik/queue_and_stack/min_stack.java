package leetcode.stormik.queue_and_stack;

import java.util.ArrayList;
import java.util.List;

public class min_stack {


    List<Integer> ez;
    int size = 0;

    public MinStack() {
        ez = new ArrayList<>();
    }

    public void push(int val) {
        ez.add(val);
        size++;
    }

    public void pop() {
        ez.remove(size-1);
        size--;
    }

    public int top() {
        return ez.get(size-1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (ez.get(i) < min) min = ez.get(i);
        }
        return min;
    }

}
