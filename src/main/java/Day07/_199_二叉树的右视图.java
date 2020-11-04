package Day07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author:付文杰
 * @date :2020/11/4 21:46
 */
public class _199_二叉树的右视图 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            list.add(q.peek().val);
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if (temp.right != null)
                    q.offer(temp.right);
                if (temp.left != null)
                    q.offer(temp.left);

            }
        }
        return list;
    }
    

}
