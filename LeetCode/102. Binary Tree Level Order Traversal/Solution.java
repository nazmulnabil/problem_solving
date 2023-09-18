import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<Integer> queue =new LinkedList<>();

        queue.add(root.val);
        list.add(new ArrayList<>().add(root.val));

        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            if(root.left!=null)
              queue.add(root.left);
              if(root.right!=null)
              queue.add(root.right);
        }
    }
}