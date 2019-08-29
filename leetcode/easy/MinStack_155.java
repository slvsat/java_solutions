package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinStack_155 {

    private List<Integer> main;

    public MinStack_155() {
        main = new ArrayList<>();
    }

    public void push(int x) {
        main.add(x);
    }

    public void pop() {
        main.remove(main.size() - 1);
    }

    public int top() {
        return main.get(main.size() - 1);
    }

    public int getMin() {
        return Collections.min(main);
    }

}