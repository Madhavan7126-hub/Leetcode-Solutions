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
    ArrayList<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
        {
              return list ;
        }

        dfs(root,"") ;
        return list;
    }
 
     
   public void dfs(TreeNode root ,String ans )
   {
        if(root==null)
        {
            return ;
        }

        ans+=root.val ;
         
          if(!(root.left==null && root.right==null))
        {
            ans+= "->";
        }
       
        if(root.left==null && root.right==null)
        {
           list.add(ans);
        }

        dfs(root.left,ans);
        dfs(root.right,ans);
   }

}