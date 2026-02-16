class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length ;
        int []ans = new int [2*len];

        for(int i =0 ;i<len ;i++)
        {
            ans[i]= nums[i];
        }
         int ref = 0 ;
        for(int i =len;i<ans.length;i++)
        {   
            ans[i]=nums[ref];
            ref++; 
        }
        return ans;
}    
}