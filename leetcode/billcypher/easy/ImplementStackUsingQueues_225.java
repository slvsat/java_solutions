package billcypher.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues_225 {

    class MyStack {

        private Queue<Integer> first;
        private Queue<Integer> second;
        int top;
        /** Initialize your data structure here. */
        public MyStack() {
            first = new LinkedList<>();
            second = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            if (first.isEmpty() && !second.isEmpty()) {
                second.add(x);
                top = x;
            } else if (second.isEmpty() && !first.isEmpty()) {
                first.add(x);
                top = x;
            } else if (second.isEmpty() && first.isEmpty()) {
                first.add(x);
                top = x;
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            if (first.isEmpty() && !second.isEmpty()) {
                while(second.size() > 1) {
                    int last = second.poll();
                    first.add(last);
                    top = last;
                }
                return second.poll();
            } else if (second.isEmpty() && !first.isEmpty()) {
                while(first.size() > 1) {
                    int last = first.poll();
                    second.add(last);
                    top = last;
                }
                return first.poll();
            } else if (second.isEmpty() && first.isEmpty()) {
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        /** Get the top element. */
        public int top() {
            return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            if (!first.isEmpty() || !second.isEmpty()) return false;
            return true;
        }
    }

}
