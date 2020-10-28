package Day05;

/**
 * @author:付文杰
 * @date :2020/10/28 21:41
 */
public class _141_环形链表 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode low = head;
        ListNode fast = head.next;
        while (low != fast) {
            if (fast == null || fast.next == null || low == null)
                return false;
            low = low.next;
            fast = fast.next.next;
        }
        return true;
    }
}
