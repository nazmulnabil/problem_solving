import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
           Queue<TreeNode> q = new LinkedList<>();

           q.add(root);
           while(!q.isEmpty()){
            TreeNode node=q.poll();
            c++;
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
           }
        return c;
    }
}