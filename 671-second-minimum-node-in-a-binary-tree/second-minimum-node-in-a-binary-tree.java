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
      TreeSet<Integer> set = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
      
adding(root);

if (set.size() < 2) {
    return -1; // or whatever LeetCode expects
}

int first = set.first();
Integer second = set.higher(first);

return second;
 
    }

   public void adding (TreeNode root)
   {
        if(root==null)
        {
            return ;
        }

        set.add(root.val) ;
         
         adding(root.left);
         adding(root.right);
        
   }
}
