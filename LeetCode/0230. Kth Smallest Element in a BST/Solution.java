import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pQueue =new PriorityQueue<>();
        int kthSmallest=0;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            pQueue.add(current.val);
            if(current.left!=null)
            queue.offer(current.left) ;
            if(current.right!=null)
            queue.offer(current.right) ;

        }
           
        for(int i=0;i<k;i++){
          kthSmallest=pQueue.poll();
        }
          return kthSmallest;
    }
}