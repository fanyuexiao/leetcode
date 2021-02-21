package tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 层序遍历二叉树
 * 层序遍历没有递归做法
 */
public class levelOrder {
    public void levelOrder(TreeNode treeNode){
        if (treeNode == null) return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode t = queue.poll();
            System.out.println(t.val + "  ");
            if (t.left != null) queue.add(t.left);
            if (t.right != null) queue.add(t.right);
        }
    }
}
