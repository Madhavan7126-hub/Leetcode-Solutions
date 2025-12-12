class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int len = arr.length ;
        int count =0 ;
        int i =0 ;
        int j =0 ;
         float  sum = 0;

        while(j<len)
        {

             sum+=arr[j];
             if((j-i) +1==k)
             {
            float  avg = sum/k ; 
                sum-=arr[i];
                i++ ;                  //  shrinks the window 

                if(avg>=threshold)
                {
                    count++ ;
                }



             }

             j++ ;    //expand the window 



        }

        return count ;
    }
}