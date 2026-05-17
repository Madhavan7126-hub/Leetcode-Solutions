class Solution {
    public int findLongestChain(int[][] pairs) {
            Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

            int count =0 ;

             int lastone = Integer.MIN_VALUE ;

             for(int[] pair : pairs)
             {
                if(pair[0] > lastone )
                {
                    count++ ;
                    lastone = pair[1];
                }
             }

             return count ;
    }
}