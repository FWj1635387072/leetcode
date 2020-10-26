package Day01;

import java.util.Stack;

public class _1047_删除字符串中的所有相邻重复项 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        
    }

    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0;i < S.length();i++){
            if(stack.isEmpty() || stack.peek() != S.charAt(i))
                stack.push(S.charAt(i));
            else{
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
