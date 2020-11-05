package Day08;

/**
 * @author:付文杰
 * @date :2020/11/5 21:20
 */
public class _110_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        return dfs(root);
    }

    boolean dfs(TreeNode root) {
        if (root == null)
            return true;
        return height(root) > 0;
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        int left = 0, right = 0;
        if (root.left != null)
            left = height(root.left);
        if (root.right != null)
            right = height(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;

    }

}
