class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s =0 ;
        double max_avg = Integer.MIN_VALUE ;
        
        double sum = 0; 

        for(int j =0 ;j<nums.length;j++)
        {

               sum+=nums[j];
            if((j-s)+1 >=k)
            {
                max_avg=  Math.max(max_avg,sum/k) ;
                 sum = sum-nums[s];
                 s++ ;
            }
           
        }
        return max_avg; 
    }
}