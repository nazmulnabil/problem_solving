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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int kthlargest=0;
        queue.add(root);

        while(!queue.isEmpty()){
              int currentLevelSize=queue.size();
              int sum=0;

              for(int i=0;i<currentLevelSize;i++){
                TreeNode node = queue.poll();
                sum+=node.val;

                if(node.left!=null)
                 queue.add(node.left);
                 
                 if(node.right!=null)
                 queue.add(node.right);
                    

              }

              maxHeap.add(sum);
 

        }
                  for(int i=0;i<k;i++){
                    kthlargest=maxHeap.poll();
                  }      

                  return kthlargest;
    }
}