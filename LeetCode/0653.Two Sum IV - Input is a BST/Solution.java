import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {

 
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        List<Integer> list=new ArrayList<Integer>();
      Queue<Integer> queue=new LinkedList<>();

      queue.offer(root);

      while(!queue.isEmpty()){
        TreeNode current=queue.poll();
        list.add(current.val);

        if(current.left!=null)
         queue.offer(current.left);
         if(current.right!=null)
         queue.offer(current.right);
      }

       for(int i=0;i<list.size();i++){
              if(hm.containsKey(k-list.get(i)))
              return true;
              else{
                hm.put(list.get(i), i);
              }

       }

        return false;
    }
}