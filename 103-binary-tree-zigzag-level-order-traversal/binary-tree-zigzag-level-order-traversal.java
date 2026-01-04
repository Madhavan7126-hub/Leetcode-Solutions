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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          
          List<List<Integer>> result = new ArrayList<>();

          Deque<TreeNode> q = new LinkedList<>();

        if(root==null)
        {
            return result  ;
        }

        q.addFirst(root);

        boolean  reverse = false ;

        while(!q.isEmpty())
        {
            List<Integer>  currlevel = new ArrayList<>();
            int len= q.size();

            for(int i =0 ;i<len;i++)
            {
                if(!reverse)
                {
                   TreeNode currnode =q.pollFirst();
                   currlevel.add(currnode.val);

                   if(currnode.left!=null)
                   {
                    q.addLast(currnode.left);
                   }
                   if(currnode.right!=null)
                   {
                    q.addLast(currnode.right);
                   }
                }

                else{
            
                   TreeNode currnode =q.pollLast();
                   currlevel.add(currnode.val);

                   if(currnode.right!=null)
                   {
                    q.addFirst(currnode.right);
                   }
                   if(currnode.left!=null)
                   {
                    q.addFirst(currnode.left );  
                   }
                

                }
            }

            reverse=!reverse;
            result.add(currlevel);
            
        }  
        return result;
        
    }
}