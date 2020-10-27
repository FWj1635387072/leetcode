package Day04;

import java.util.HashSet;

/**
 * @author:付文杰
 * @date :2020/10/27 22:15
 */
public class _面试_2_1_移除重复节点 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null)
            return null;
        HashSet<Integer> set = new HashSet<Integer>();

        ListNode q = head;
        set.add(head.val);

        while (q.next != null) {
            ListNode p = q.next;
            if (set.add(p.val))
                q = q.next;
            else
                q.next = q.next.next;
        }
        return head;
    }
}

