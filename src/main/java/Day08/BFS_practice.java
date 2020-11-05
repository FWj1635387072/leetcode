package Day08;

/**
 * @author:付文杰
 * @date :2020/11/5 20:21
 */
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class BFS_practice {
    int bfs(TreeNode root) {
        if (root == null)
            return 0;
        int left = bfs(root.left);
        int right = bfs(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
