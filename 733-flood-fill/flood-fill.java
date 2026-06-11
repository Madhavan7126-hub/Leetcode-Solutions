class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows =image.length ;
        int cols =image[0].length ;

        int [][] directions= {
            {-1,0},
            {0,1},
            {1,0},
            {0,-1}
        }  ; 

    

        Queue <int[]> q =  new LinkedList<>();
           int  ref = image[sr][sc] ; 
         if (image[sr][sc]==color)
         {
            return image ;
         }
        q.offer(new int[] {sr,sc}) ;
         
        image[sr][sc]=color ;
       
       while (!q.isEmpty())
       {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];


            for(int[] dir : directions)
            {
                  int nextRow = r + dir[0];
                   int nextCol = c+ dir[1];

                   if(nextRow >= 0  && nextRow< rows  && nextCol >=0 && nextCol<cols && 
                        image[nextRow][nextCol]==ref )
                        {
                            q.offer(new int[]{nextRow,nextCol}) ;
                            image[nextRow][nextCol]=color ;
                        } 
            }
       }


return image ;

    }
}