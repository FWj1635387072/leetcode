package Day1;

import java.util.Stack;

public class _面试09 {

    public static void main(String[] args) {
    }

    static class CQueue {
        Stack<Integer> numStack ,helpStack;

        public CQueue() {
            numStack = new Stack<Integer>();
            helpStack = new Stack<Integer>();
        }

        public void appendTail(int value) {
            while (!helpStack.isEmpty()){
                numStack.push(helpStack.pop());
            }
            numStack.push(value);
        }

        public int deleteHead() {
            if(numStack.isEmpty() && helpStack.isEmpty())
                return  -1;
            while(!numStack.isEmpty()){
                helpStack.push(numStack.pop());
            }
            return helpStack.pop();
        }
    }
}
