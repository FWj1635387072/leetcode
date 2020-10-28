package Day05;

/**
 * @author:付文杰
 * @date :2020/10/28 21:43
 */
public class _面试_2_6_回文链表 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, low = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        if (fast != null) {
            low = low.next;
        }
        low = reverse(low);
        while (head.val != low.val) {
            head = head.next;
            low = low.next;
        }
        if (head != null || low != null)
            return false;
        return true;
    }

    ListNode reverse(ListNode head) {
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode p = head.next, q = head;
        while (p != null) {
            q.next = pre.next;
            pre.next = q;
            q = p;
            p = p.next;
        }
        return pre.next;
    }
}
