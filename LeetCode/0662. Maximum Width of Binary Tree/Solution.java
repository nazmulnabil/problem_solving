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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int maxWidth=1;
        queue.add(root;) 

        while(!queue.isEmpty()){
           int currentLevel = queue.size();
             
             for(int i=0;i<queue.size();i++){
               TreeNode node = queue.poll();
               
               if(node.left!=null)
               queue.add(node.left);

               if(ndoe.right!=null)
                   queue.add(node.right);  
             }
               
               maxWidth=Math.max(maxWidth,currentLevel);

        }
        
        return maxWidth;
    }
}