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
    public List<Double> averageOfLevels(TreeNode root) {
        
            List<Double> result = new ArrayList<>();

            if(root==null)
            {
                return result ;
            }

            Queue<TreeNode> q = new LinkedList<>();

            q.offer(root);

            while(!q.isEmpty())
            {
                int len = q.size();
                List<Integer> currlevel = new ArrayList<>();
                for(int i =0 ;i<len;i++)
                {
                        TreeNode currNode =  q.poll();
                        currlevel.add(currNode.val);

                        if(currNode.left!=null)
                        {
                            q.offer(currNode.left) ;
                        }
                         if(currNode.right!=null)
                        {
                            q.offer(currNode.right) ;
                        }

                }

                double avg = average(currlevel);
                result.add(avg);


            }
            return result ;
    }

    public static double average(List<Integer> numbers)
    {
        long sum =0 ;
        int len = numbers.size();

        for(int i =0 ;i<len;i++)
        {
            sum+=numbers.get(i);
        }
         return (double) sum / len; 
    }
}