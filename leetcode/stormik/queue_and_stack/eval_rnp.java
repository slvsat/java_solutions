package leetcode.stormik.queue_and_stack;

import java.util.Stack;

public class eval_rnp {

    public int evalRPN(String[] tokens) {
        Stack<Integer> ints = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int one = ints.pop();
                int second = ints.pop();
                ints.push(second+one);
            } else if (tokens[i].equals("-")) {
                int one = ints.pop();
                int sec = ints.pop();
                ints.push(sec - one);
            } else if (tokens[i].equals("*")) {
                int one = ints.pop();
                int sec = ints.pop();
                ints.push(sec * one);
            } else if (tokens[i].equals("/")) {
                int one = ints.pop();
                int sec = ints.pop();
                ints.push(sec / one);
            } else {
                ints.push(Integer.parseInt(tokens[i]));
            }
        }
        return ints.pop();
    }

}
