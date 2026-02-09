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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root ==null)
        {
            return null ;
        }
        if(root.val<low)
        {
            return trimBST(root.right,low,high);        //right subtree only taken 
        }
        if(root.val>high)
        {
            return trimBST(root.left,low,high);      //left subtree only taken 
        }
   
 //both will be taken bcoz the root  value is within the range 

    //this conncets the   treenodes 

    root.left  =    trimBST(root.left,low,high); 
    root.right =   trimBST(root.right,low,high);  
        
        return root ;     // when the root lies within the range the node is returned 
    }
}