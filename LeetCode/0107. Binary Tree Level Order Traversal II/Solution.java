import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> list=new ArrayList<>();
         Queue<TreeNode> queue =new LinkedList<>();
         if(root!=null)
         queue.add(root);

        while(!queue.isEmpty()){
              int currentLevel= queue.size();
              List<Integer> levelList=new ArrayList<>();
              for(int i=0;i<currentLevel;i++){
                 TreeNode node= queue.poll();
                 levelList.add(node.val);
                 if(node.left!=null)
                 queue.add(node.left);
                 if(node.right!=null)
                 queue.add(node.right);
              }
              list.add(levelList);
            

        }
        Collections.reverse(list);
        return list;
    }
}