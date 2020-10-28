package Day05;

/**
 * @author:付文杰
 * @date :2020/10/28 21:21
 */
public class Offer18_删除链表节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode vir = new ListNode(-1);
        vir.next = head;
        ListNode p = head;
        ListNode pre = vir;
        while (p != null) {
            if (p.val == val) {
                pre.next = p.next;
                break;
            }
            p = p.next;
            pre = pre.next;
        }
        return vir.next;
    }
}
