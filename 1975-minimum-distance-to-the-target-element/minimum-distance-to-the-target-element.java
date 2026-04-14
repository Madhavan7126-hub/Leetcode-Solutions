class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length ;
        int ans =9999;
        for(int i =0;i<len;i++)
        {
            if(nums[i]==target)
            {
                ans = Math.min(Math.abs(i-start),ans);
                
            }
        }
        return ans ;
        
    }
}