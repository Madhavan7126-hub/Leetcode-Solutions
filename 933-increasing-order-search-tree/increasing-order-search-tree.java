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
     TreeNode dummy = new TreeNode(0);
        TreeNode temp = dummy ;
    public TreeNode increasingBST(TreeNode root) {
       
        helper(root);
        return dummy.right ;
    }
    public void helper(TreeNode root )
    
    {
        if(root==null)
        {
            return;    //base case   
        }
        helper(root.left) ;
        root.left=null;     // need to make left child null ; otherwise tree cycle will be formed 

        temp.right=root ;
        temp=root ;

        helper(root.right);

           //inorder ytraversal is used in order to create a sorted increasing right skewed tree 
        
    }
    
    
}