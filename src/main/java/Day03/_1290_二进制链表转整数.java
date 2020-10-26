package Day03;

/**
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。
 * 已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 *
 * @author:付文杰
 * @date :2020/10/26 20:59
 */
public class _1290_二进制链表转整数 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println(getDecimalValue(head));

    }

    public static int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode p = head;
        while (p != null) {
            res = res * 2 + p.val;
            p = p.next;
        }
        return res;
    }
}
