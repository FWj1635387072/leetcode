package Day08;

/**
 * @author:付文杰
 * @date :2020/11/5 20:44
 */
public class _129_根节点到叶子节点的数字和 {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        int num = 0;
        bfs(root.left, num);
        bfs(root.right, num);
        return sum;
    }

    void bfs(TreeNode root, int num) {
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += num;
            return;
        }
        if (root.left != null) {
            bfs(root.left, num);
        }
        if (root.right != null)
            bfs(root.right, num);
    }
}
