package main.java.tsyhaniuknazar;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

public class LincorStack {
    public final Deque<Integer> stack = new ArrayDeque<>();

    private int min;
    private int secondMin;

    public void push(int element) {
        if (stack.isEmpty()) {

            min = element;
            secondMin = element;

            stack.push(element);
        }
        else if (element < min) {
            secondMin = min;
            min = element;

            stack.push(element);
        }
        else {
            stack.push(element);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        if (min == stack.peek()) {
            min = secondMin;
        }

        return stack.pop();
    }

    public int peekMin() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        return min;
    }
}
