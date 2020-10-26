package Day03;

/**
 * @author:付文杰
 * @date :2020/10/26 21:17
 */
public class _面试2_2_倒数第k个数 {
    public int kthToLast(ListNode head, int k) {
        ListNode front = head, last = head;
        for (int i = 0; i < k; i++)
            last = last.next;
        while (last != null) {
            front = front.next;
            last = last.next;
        }
        return front.val;
    }
}
