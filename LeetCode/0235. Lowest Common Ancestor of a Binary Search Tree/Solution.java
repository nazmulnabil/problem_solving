
 class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root.val>p.val&&root.val>q.val)
         return lowestCommonAncestor(root.left);
        else if(root.val<p.val&&root.val<q.val)
         return lowestCommonAncestor(root.right);
         else
          return root;
        
    }
}