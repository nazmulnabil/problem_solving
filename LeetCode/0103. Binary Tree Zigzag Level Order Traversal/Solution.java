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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> listOfLists=new ArrayList<>();
         if(root!=null) 
        queue.add(root);
         int levelNo=0;
        while(!queue.isEmpty()){
              int currentLevel=queue.size();
             
              List<Integer> list = new ArrayList<>();
              for(int i=0;i<currentLevel;i++){
                   TreeNode node=queue.poll();
                   list.add(node.val);
                   if(node.left!=null)
                   queue.add(node.left);
                     if(node.right!=null)
                   queue.add(node.right); 
              }
              if(levelNo%2!=0)
               Collections.reverse(list);
               listOfLists.add(list);
               levelNo++;

        }

        return listOfLists;
        
    }
}