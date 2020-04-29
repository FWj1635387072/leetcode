package Day2;

import java.util.Stack;

public class _844_比较含退格的字符串 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##", "a####"));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<Character>();
        Stack<Character> t = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#')
                s.push(S.charAt(i));
            else if (!s.empty())
                s.pop();
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#')
                t.push(T.charAt(i));
            else if (!t.empty())
                t.pop();
        }
        return s.toString().equals(t.toString());
    }

}
