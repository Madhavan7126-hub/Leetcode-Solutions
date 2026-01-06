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
    public int findBottomLeftValue(TreeNode root) {
        
         List<List<Integer>> result = new ArrayList<>();
     
      Queue <TreeNode> q = new LinkedList<>();
    
      q.offer(root);
      while(!q.isEmpty())
      {
         int size = q.size();
         
         List<Integer> list = new ArrayList<>();

         for(int i=0 ;i<size ;i++)
         {
            TreeNode currNode =q.poll();

            list.add(currNode.val);

            if(currNode.left!=null)
            {
                q.offer(currNode.left);
            }
          if(currNode.right!=null)
            {
                q.offer(currNode.right);
            }

         }
         result.add(list);
      }
      
        int size = result.size();
         
         return result.get(size-1).get(0);
          
    }
}