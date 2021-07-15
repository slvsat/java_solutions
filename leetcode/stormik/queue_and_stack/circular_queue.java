package leetcode.stormik.queue_and_stack;

import java.util.ArrayList;
import java.util.List;

public class circular_queue {

    int[] q;
    int head;
    int tail;
    int cap;
    int size;

    public circular_queue(int k) {
        q = new int[k];
        head = -1;
        tail = -1;
        cap = k;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (size == cap) return false;
        if (tail+1 >= cap) {
            tail = 0;
            q[tail] = value;
        } else {
            tail++;
            q[tail] = value;
        }
        if (head == -1) head++;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (size == 0) return false;
        head++;
        size--;
        if (head >= cap) head = 0;
        if (size == 0) {
            tail = -1;
            head = -1;
        }
        return true;
    }

    public int Front() {
        if (size == 0) return -1;
        return q[head];
    }

    public int Rear() {
        if (size == 0) return -1;
        return q[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == cap;
    }

}
