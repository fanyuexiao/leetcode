package tree;

/**
 * 后续遍历
 * 左右根
 */
public class postOrder {
    /**
     * 递归法
     */
    public void postOrder1(TreeNode root){
        if (root == null) return;
        postOrder1(root.left);
        postOrder1(root.right);
        System.out.println(root.val + "  ");
    }
}
