package Day01;

import java.util.Stack;

public class _1021_删除最外层括号 {
    public static void main(String[] args) {
        String str = "(()()()(()()))(())";
        System.out.println(solution2(str));
    }

    public static String solution1(String s) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c : s.toCharArray()) {
            if (c == ')') level--;
            if (level >= 1) sb.append(c);
            if (c == '(') level++;
        }
        return sb.toString();
    }

    public static String solution2(String S) {
        int begin = 0, end = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(')
                stack.push(ch);
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    sb.append(S.substring(begin + 1, end));
                    begin = i + 1;
                }
            }
        }
        return sb.toString();
    }
}
