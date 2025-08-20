class Solution {
    public int minEatingSpeed(int[] piles, int h) {
          int start = 1 ;
          int end = maximum(piles) ;
         
          while(start<=end )
          {
            int mid = start + (end-start)/2 ;
            long totalhours = requiredtime(piles,mid );
            if(totalhours<=h)
            {
                end=mid-1 ;
            }
            else{
                start=mid+1 ; 
            }
                    
          }
          return start ;
    }


  static long requiredtime(int[]arr,int banana)
  {
 long  totalhours =0 ;
     for(int i=0 ;i<arr.length;i++)
        {
           totalhours +=(int) Math.ceil((double)arr[i]/((double)banana));
        }

        return totalhours ;
    
  }

    static int maximum(int[]arr)
    {
        int max  = 0 ;
        for(int i=0 ;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
        }
        return max ;
    }

}

