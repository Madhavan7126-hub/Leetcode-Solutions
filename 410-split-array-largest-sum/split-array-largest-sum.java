class Solution {
    public int splitArray(int[] nums, int k) {
    
      int start =0 ;
      int end =0 ;

     for(int i =0;i<nums.length;i++)
     {
        start = Math.max(start,nums[i]); //at the end of the loop we will have the maximum value in the array which is case 1  if m=len
        end+=nums[i]; //this will have the sum of all elements in the case if m=1 
     }
 // binary search
 while(start<end)
 {
        int pieces =1 ;  //minimum piece 
        int sum =0;
        int mid = start+ (end-start) /2 ;
        for(int num :nums)
        {
            if(sum+num > mid )  // at this stage we cant add to the same sub array .
            {
                pieces++;     //so create new one 
                sum=num ;     //and start adding from the current  element . 
            }
            else
            {
           sum+=num ;
            }
        }
      if(pieces<=k)
      {
        end=mid;
      }
      else
      {
        start=mid+1 ;
      }

}
    return end ;
    }
         }