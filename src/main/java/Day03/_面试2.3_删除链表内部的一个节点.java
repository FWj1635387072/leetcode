package Day03;

/**
 * 只能访问要删除的节点
 *
 * @author:付文杰
 * @date :2020/10/26 20:47
 */

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}

class _237_删除链表内部的一个节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
