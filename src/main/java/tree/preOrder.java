package tree;

import java.util.Stack;

/**
 * 先序遍历二叉树
 * 根左右
 */
public class preOrder {
    /**
     * 递归法
     */
    public void preOrder1(TreeNode root){
        if (root == null) return;
        System.out.println(root.val + "  ");
        preOrder1(root.left);
        preOrder1(root.right);
    }

    /**
     * 非递归1
     */
    public void preOrder2(TreeNode root){
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode t = stack.pop();
            System.out.println(t.val + "  ");
            if (t.right != null) stack.push(t.right);
            if (t.left != null) stack.push(t.left);
        }
    }

    /**
     * 非递归2
     */
    public void preOrder3(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null){
            if (root != null){
                System.out.println(root.val + "  ");
                stack.push(root.left);
                root = root.left;
            }else {
                TreeNode t = stack.pop();
                root = t.right;
            }
        }
    }
}
