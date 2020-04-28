package Day1;

import java.util.Stack;

public class _面试03_04 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }

    static class MyQueue {
        Stack<Integer> numStack;
        Stack<Integer> helpStack;

        public MyQueue() {
            numStack = new Stack<Integer>();
            helpStack = new Stack<Integer>();
        }

        public void push(int x) {
            while (!helpStack.isEmpty()){
                numStack.push(helpStack.pop());
            }
            numStack.push(x);
        }

        public int pop() {
            peek();
            return helpStack.pop();
        }

        public int peek() {
            if(!numStack.isEmpty())
                numStack.peek();
            while (!numStack.isEmpty()){
                helpStack.push(numStack.pop());
            }
            return helpStack.peek();
        }

        public boolean empty() {
            return numStack.isEmpty() && helpStack.isEmpty();
        }
    }
}
