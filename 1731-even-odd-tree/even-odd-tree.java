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
    int count =0;
   
    public boolean isEvenOddTree(TreeNode root) {

        Queue <TreeNode> q = new LinkedList<>();

        q.offer(root);
     List<Integer> list = new ArrayList<>();
        while(!q.isEmpty())
        {
            int size = q.size();
             list.clear();
              
            for(int i =0 ; i<size ;i++)
            {
                
                TreeNode curr  = q.poll();
                  
                  list.add(curr.val) ;
                 
                 if(curr.left!=null)
                 {
                    q.offer(curr.left);
                 }
                 if(curr.right!=null)
                 {
                    q.offer(curr.right);
                 }
            }
            
           
            
            if(!check(list))
            { 
                return false  ;
            }
              count++;
    }
    return true  ;
    }
    public  boolean check( List<Integer> list )
    {
      if(count%2==1)
      {
        int first = list.get(0);

           if(list.get(0) % 2 == 1) return false; 
           for(int i = 1; i < list.size(); i++)
           {
                int  num = list.get(i) ;
                if(num%2==1 ||  first<=num)
                {
                    return false ;
                }
                first=num ;
                
           } 
      }
      else
      {
        int first = list.get(0);
           if(list.get(0) % 2 == 0) return false; 
           for(int i =1 ;i<list.size();i++)
           {
                int  num = list.get(i) ;
                if(num%2==0 ||  first>=num)
                {
                    return false ;
                }
                first=num ;
                
           } 
      }
      return true ;
    }
}