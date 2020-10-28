package Day05;

/**
 * @author:付文杰
 * @date :2020/10/28 20:54
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        val = x;
    }

    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}

public class _21_合并两个升序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;
        ListNode h1 = l1, h2 = l2;
        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                pre.next = h1;
                h1 = h1.next;
            } else {
                pre.next = h2;
                h2 = h2.next;
            }
            pre = pre.next;
        }
        pre.next = h1 == null ? h2 : h1;
        return preHead.next;
    }
}
