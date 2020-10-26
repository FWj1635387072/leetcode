package Day02;

import java.util.LinkedList;
import java.util.Queue;

public class _225_用队列实现栈 {

    class MyStack {
        Queue<Integer> queen;
        Queue<Integer> helpQueen;

        public MyStack() {
            queen = new LinkedList<Integer>();
            helpQueen = new LinkedList<Integer>();
        }

        public void push(int x) {
            queen.offer(x);
            while (helpQueen.size() > 0) {
                queen.offer(helpQueen.poll());
            }
            Queue temp = queen;
            queen = helpQueen;
            helpQueen = temp;
        }

        public int pop() {
            return helpQueen.poll();
        }

        public int top() {
            return helpQueen.peek();
        }

        public boolean empty() {
            return helpQueen.isEmpty();
        }
    }
}
