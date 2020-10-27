package Day04;

/**
 * @author:付文杰
 * @date :2020/10/27 22:01
 */
public class _876_链表的中间节点 {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        ListNode fast = head;
        ListNode low = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }
}
