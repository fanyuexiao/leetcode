package tree;

import java.util.Stack;

/**
 * 中序遍历
 * 左根右
 */
public class inOrder {
    /**
     * 递归法
     */
    public void inOrder1(TreeNode root){
        if (root == null) return;
        inOrder1(root.left);
        System.out.println(root.val + "  ");
        inOrder1(root.right);
    }

    /**
     * 非递归1
     */
    public void inOrder2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null){
            if (root != null){
                stack.push(root.left);
                root = root.left;
            }else {
                TreeNode t = stack.pop();
                System.out.println(root.val + "  ");
                root = t.right;
            }
        }
    }
}
