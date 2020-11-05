package Day08;

/**
 * @author:付文杰
 * @date :2020/11/5 20:52
 */
public class _98_验证二叉搜索树 {

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return false;
        return dfs(root);
    }

    boolean dfs(TreeNode root) {
        if (root != null)
            return true;
        boolean left = false, right = false;
        if (root.left != null)
            left = dfs(root.left);
        else
            left = true;
        if (root.right != null)
            right = dfs(root.right);
        else
            right = true;
        return (root.left.val < root.val && root.right.val > root.val) && left && right;
    }
}
