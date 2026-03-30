class Solution {
    public int[] plusOne(int[] digits) {
         int len = digits.length ;

         if(digits[len-1]!=9)
         {
              digits[len-1]++;  //  if the last digit is not 9 then there is no need of extra indices 
            return digits ;
         }
         
       int ind =0 ;
       for(int i =len-1 ;i>=0;i--)
       {
             if(digits[i]==9)
             {
                digits[i]=0 ;
             }
             else{
                 ind =i ;
                 break ;
             }
       }

       if(ind==0 && digits[ind]==0)
       {
           int[]  ans = new int[len+1];
           ans[0]=1 ;
           return ans ;
       }
       digits[ind]++;
        return digits ;

    }
}