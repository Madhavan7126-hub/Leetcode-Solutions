class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length ;
        int count =0 ;
     
     int[][] directions = {
          {-1,0},
          {0,-1},
          {0,1},
          {1,0}
     } ;
        for(int row =0 ;row<rows;row++)
        {
            for(int col =0;col<cols;col++)
            {
                if(grid[row][col]=='1')
                {
                    count ++ ;

                    //creating queue 

                      Queue<int[]> q = new LinkedList<>();
                        
                        q.offer(new int[]{row,col} );
                       //mark as visited
                        grid[row][col]='0'; 

                        while(!q.isEmpty())
                        {
                            int[] curr = q.poll();
                            int r = curr[0];
                            int c= curr[1];
                          
                          for(int [] dir : directions)
                          {
                               int newRow = r+dir[0];
                               int newCol = c+dir[1];


                               if(newRow>=0 && newRow <rows && newCol>=0 && newCol<cols
                                && grid[newRow][newCol]=='1') 
                                {
                                         q.offer(  new int[]{newRow,newCol} ) ;
                                         grid[newRow][newCol] ='0'  ;
                                }
                          }


                        }
                        
                     

                }
            }
        }

        return count;
    }
}