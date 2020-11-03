package Day06;


import java.util.Stack;

/**
 * @author:付文杰
 * @date :2020/11/3 16:53
 */
public class _1544_整理字符串 {
    public String makeGood(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (stack.isEmpty()) {
                stack.push(ch[i]);
            } else {
                char temp = stack.peek();
                if (Math.abs(temp - ch[i]) == Math.abs('A' - 'a'))
                    stack.pop();
                else
                    stack.push(ch[i]);
            }
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}
