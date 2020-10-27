package Day04;

/**
 * @author:付文杰
 * @date :2020/10/27 22:37
 */
public class _面试_2_7_链表相交 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != temp2) {
            temp1 = temp1 == null ? headB : temp1.next;
            temp2 = temp2 == null ? headA : temp2.next;
        }
        return temp1;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int count1 = count(headA);
        int count2 = count(headB);

            
        return null;
    }

    public int count(ListNode head) {
        ListNode p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }
}
