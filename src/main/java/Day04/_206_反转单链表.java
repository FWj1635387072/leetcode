package Day04;

/**
 * @author:付文杰
 * @date :2020/10/27 22:00
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class _206_反转单链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode p = head.next;
        ListNode q = head;
        head.next = null;
        while (p != null) {
            ListNode temp = p.next;
            p.next = q;

            q = p;
            p = temp;
        }
        return q;
    }
}
