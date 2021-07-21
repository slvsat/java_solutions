package leetcode.stormik.queue_and_stack;

import java.util.Stack;

public class valid_parentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> closed = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (curr == '(') closed.push(')');
            else if (curr == '[') closed.push(']');
            else if (curr == '{') closed.push('}');
            else {
                if (!closed.isEmpty()) {
                    Character top = closed.pop();
                    if (top != curr) return false;
                } else return false;
            }
        }
        return closed.isEmpty();
    }

}
