package Day07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:付文杰
 * @date :2020/11/4 21:39
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            depth++;
        }
        return depth;
    }
}
