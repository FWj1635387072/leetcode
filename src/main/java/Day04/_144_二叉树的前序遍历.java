package Day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author:付文杰
 * @date :2020/10/27 21:48
 */

class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _144_二叉树的前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<Integer>();
        if (root == null)
            return ls;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode p = stack.pop();
            if (p.right != null)
                stack.push(p.right);
            if (p.left != null)
                stack.push(p.left);
            ls.add(p.val);
        }
        return ls;
    }

}
