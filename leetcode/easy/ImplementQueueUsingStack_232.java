package leetcode.easy;

import java.util.Stack;

public class ImplementQueueUsingStack_232 {

    class MyQueue {

        /** Initialize your data structure here. */
        private Stack<Integer> first;
        private  Stack<Integer> temp;
        private int peek = Integer.MIN_VALUE;

        public MyQueue() {
            first = new Stack<>();
            temp = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            first.push(x);
            if (peek == Integer.MIN_VALUE) peek = x;
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while (first.size() > 1) {
                temp.push(first.pop());
            }
            int lastOne = first.pop();
            peek = temp.empty() ? Integer.MIN_VALUE : temp.pop();
            if (peek != Integer.MIN_VALUE) first.push(peek);
            while(temp.size() > 1) {
                first.push(temp.pop());
            }
            return lastOne;
        }

        /** Get the front element. */
        public int peek() {
            return peek;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return first.empty();
        }
    }

}
