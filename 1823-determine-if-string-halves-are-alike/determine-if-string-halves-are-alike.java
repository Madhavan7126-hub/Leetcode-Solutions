class Solution {
    public boolean halvesAreAlike(String s) {
     int len = s.length();

      String first = s.substring(0,len/2) ;
      
      String second =  s.substring(len/2,len);
 
      int vow1 =0;
      int vow2 = 0 ;
      for(int i =0 ;i<first.length();i++)
      {
          Character C =  first.charAt(i) ;
          if(isVowel(C))
          {
            vow1++ ;
          }
      }
       
       for(int i =0 ;i<second.length();i++)
      {
          Character C =  second.charAt(i) ;
          if(isVowel(C))
          {
            vow2++ ;
          }
      }

      if(vow1==vow2)
      {
        return true ;
      }
      else{
        return false ;
      }
    }



    public boolean isVowel(char c)
    {
    c = Character.toLowerCase(c);
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}