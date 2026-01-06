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
    public int maxLevelSum(TreeNode root) {
        

        Queue <TreeNode> q = new LinkedList<>();
        if(root==null)
        {
            return 0 ;
        }
        List<Integer> list = new ArrayList<>();

       q.offer(root);
     
     int count =1 ;
     int answer =0 ;
     int max =Integer.MIN_VALUE ;
       while(!q.isEmpty())
       {
            int sum =0 ;
            int size = q.size();
         
            for(int i=0;i<size;i++)
            {
                   TreeNode currnode = q.poll();
                 list.add(currnode.val);

                 if(currnode.left!=null)
                 {
                    q.offer(currnode.left);
                 }
                 if(currnode.right!=null)
                 {
                    q.offer(currnode.right);
                 }
            } 

            int len =list.size();
            for(int i =0;i<len;i++)
            {
                sum+= list.get(i);
            }
            if(sum>max)
            {
                max=sum ;
                answer = count ;
            }
            list.clear();
            count++;
            

       }
       return answer;
    }
}