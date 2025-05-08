class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length ;

        for(int i=0;i<len;i++)
        {
            char c = letters[i];
            if( c-'a' > target-'a')
            {
               return c ;
               
            }
        }
        return letters[0];
    }
}