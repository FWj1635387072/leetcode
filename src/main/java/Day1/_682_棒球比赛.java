package Day1;

import java.util.Stack;

public class _682_棒球比赛 {

    public static void main(String[] args) {
        String[] s = {"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> scores = new Stack<Integer>();
        for(int i = 0;i < ops.length;i++){
            if (ops[i].equals("+")){
                int temp1 = scores.pop();
                int temp2 = scores.peek();
                scores.push(temp1);
                scores.push(temp1 + temp2);
            }else if (ops[i].equals("D")){
                int temp = scores.peek();
                scores.push(temp*2);
            }else if (ops[i].equals("C")){
                scores.pop();
            }else{
                scores.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        for(int a : scores){
            sum+= a;
        }
        return sum;
    }
}
