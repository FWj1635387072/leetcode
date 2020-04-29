package Day2;

import java.util.ArrayDeque;
import java.util.Deque;

public class _面试题51_滑动窗口的最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0,j = 0;i < nums.length;i++){
            if (!queue.isEmpty() && i - queue.peek() >= k){
                queue.poll();
            }
            while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offer(i);
            if(i >=  k - 1){
                res[j++] = nums[queue.peek()];
            }
        }
        return res;
    }
}
