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
          List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
  
        dfspath(root,"");

        return list ;
    }



    public void dfspath(TreeNode root , String path)
    {
        //base case 

        if(root==null)
        {
            return  ;
        }

        if(path.length()==0)
        {
            path=  String .valueOf(root.val);
        }
        else{
            path =path + "->" + root.val ;
        }
        
        if(root.left==null && root.right==null)
        {
            list.add(path);
        }

        dfspath(root.left,path);
        dfspath(root.right,path);
    }

    
}