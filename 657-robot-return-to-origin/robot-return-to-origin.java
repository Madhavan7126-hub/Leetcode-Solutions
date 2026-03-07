class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0;
        int hor = 0 ;

       for(int i =0 ;i<moves.length();i++)
       {
             Character c = moves.charAt(i);

             if(c=='U')
             {
                ver++ ;
             }
             else if(c=='D')
             {
                 ver-- ;
             }
              else if(c=='L')
             {
                hor++ ; ;
             }
             else{
                hor-- ;
             }
       }
                   
            if(ver==0 &&hor==0)
            {
                return true ;
            }
   
           else{
            return false ;
           }
    }
}