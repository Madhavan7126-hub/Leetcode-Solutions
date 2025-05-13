class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false ;
        }
         long ans =0 ;
        long  temp  =x ;
        while(temp!=0)
        {
            long rem = temp%10 ;
            ans = ans*10 + rem ;
            temp=temp/10 ;
         }
         return(ans==x);
    }
}