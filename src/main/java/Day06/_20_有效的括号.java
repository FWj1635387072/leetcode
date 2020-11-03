package Day06;

import java.util.Stack;

/**
 * @author:付文杰
 * @date :2020/11/3 17:02
 */
public class _20_有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty())
                stack.push(s.charAt(i));
            else {
                switch (stack.peek()) {
                    case '(':
                        if (s.charAt(i) == ')')
                            stack.pop();
                        else
                            stack.push(s.charAt(i));
                        break;
                    case '{':
                        if (s.charAt(i) == '}')
                            stack.pop();
                        else
                            stack.push(s.charAt(i));
                        break;
                    case '[':
                        if (s.charAt(i) == ']')
                            stack.pop();
                        else
                            stack.push(s.charAt(i));
                        break;
                    default:
                        break;
                }
            }

        }
        return stack.isEmpty();
    }
}
