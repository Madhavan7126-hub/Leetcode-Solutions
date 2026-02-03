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
    boolean flag = true ;
    public boolean isUnivalTree(TreeNode root) {
         int num = root.val ;
        if(root.left==null && root.right==null)
        {
            return  true ;
        }
        helper(root,num);
        return flag ;
          
    }

    public void helper(TreeNode root,int num )
    {
        if(root==null)
        {
            return ;
        }
        if(root.val!=num)
        {
            flag = false ;
            return;
        }

        helper(root.left,num);
        helper(root.right,num);
    }
}