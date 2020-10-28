package Day05;

/**
 * @author:付文杰
 * @date :2020/10/28 21:12
 */
public class 剑指Offer_两个链表的第一个公共链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != q) {
            if (p == null)
                p = headB;
            if (q == null)
                q = headA;
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
