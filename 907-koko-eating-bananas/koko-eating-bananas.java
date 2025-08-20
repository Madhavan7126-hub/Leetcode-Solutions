class Solution {
    public int minEatingSpeed(int[] piles, int h) {
          int start = 1 ;    //minimum banana shu=ould be one .
          int end = maximum(piles) ; //the end will be the maximum from the array 
         
          while(start<=end )
          {
            int mid = start + (end-start)/2 ;
            long totalhours = requiredtime(piles,mid ); //calculate the required time for each number of k value (form 1 to end )
            if(totalhours<=h)
            {
                end=mid-1 ; // if the reqtime satisfies than search for further minimum value in  left half 
            }
            else{
                start=mid+1 ;  //if  reqtime exceeds than we need more number of bananans per hour so search for further greater k value in  right  half 
            }
                    
          }
          return start ;
    }


  static long requiredtime(int[]arr,int banana)
  {
 long  totalhours =0 ;
     for(int i=0 ;i<arr.length;i++)
        {
           totalhours +=(int) Math.ceil((double)arr[i]/((double)banana)); //formula for calculating the reqtime for k values .
        }

        return totalhours ;
    
  }
//func to find the max from the array  .
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

