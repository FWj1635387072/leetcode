package Day02;

import java.util.Stack;

public class _面试03_02栈的最小值 {

    class MinStack {
        Stack<Integer> stack, minStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.empty()) {
                minStack.push(x);
            } else {
                minStack.push(Math.min(minStack.peek(), x));
            }
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

    }

}
