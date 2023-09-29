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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        int maxSum = Integer.MIN_VALUE;
        queue.add(root);
        int level=1,maxSumLevel=Integer.MIN_VALUE;
        maxSum= Math.max(maxSum,root.val);
           
        while(!queue.isEmpty()){
              int currentLevel=queue.size();
               int sum=0;
                     
              for(int i=0;i<currentLevel;i++){
                   TreeNode node = queue.poll();
                   sum+=node.val;
                  if(node.left!=null){
                    queue.add(node.left);
                  }
                  if(node.right!=null){
                    queue.add(node.right);
                  }
              }
                  if(!hm.containsKey(sum))
                    hm.put(sum,level);
                   maxSum=Math.max(sum,maxSum);
                   level++;
            
           }

           for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getKey()==maxSum)
              maxSumLevel= entry.getValue();
           }
  
   
          return maxSumLevel;       
    }
}