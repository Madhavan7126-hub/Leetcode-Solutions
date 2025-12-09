class Solution {
    public int longestSubstring(String s, int k) {
    
          return   helper(s,k );

    }

    public static int helper(String S ,int k )
    {
        int len =S.length ();
           if(len<k)           //base case 
           {
                    return 0 ;

           } 

        int[] freq = new int[26];

        for(char c : S.toCharArray())
        {
              freq[c-'a']++;                    //counts the frequency 
        } 


        for(int i =0;i<S.length();i++)
        {
            if(freq[S.charAt(i)- 'a']<k)
            {
                       // Split the string around this invalid character
                int left = helper(S.substring(0, i), k);
                int right = helper(S.substring(i + 1), k);

                  return Math.max(left, right);
            }

           
        }
           return S.length();
    }

    }
