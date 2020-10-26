package Day03;

import java.util.LinkedList;

/**
 * @author:付文杰
 * @date :2020/10/26 21:44
 */
public class _剑指offer_06_倒序打印链表 {
    LinkedList<Integer> ls = new LinkedList<Integer>();

    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] arr = new int[ls.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ls.get(i);
        }
        return arr;
    }

    void recur(ListNode p) {
        if (p == null)
            return;
        recur(p.next);
        ls.add(p.val);
    }
}
