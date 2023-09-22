import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<Integer> queue =new LinkedList<>();

        queue.add(root.val);

        while(!queue.isEmpty()){
              int currentLevel= queue.size();
              List<Integer> levelList=new ArrayList<>();
              for(int i=0;i<currentLevel;i++){
                TreeNode node= queue.poll();
                levelList.add(node);
                 if(node.left!=null)
                 queue.add(node.left);
                 if(node.right!=null)
                 queue.add(node.right);
              }
              list.add(levelList);

        }
        return list;
    }
}