package Day2;

import java.util.HashMap;
import java.util.Stack;

public class _496_下一个更大的元素Ⅰ {
    public static void main(String[] args) {
        int[] ints = nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "   ");
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length ; i++) {
            while (!stack.empty() && nums2[i] > stack.peek())
                map.put(stack.pop(), nums2[i]);
            stack.push(nums2[i]);
        }

        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
