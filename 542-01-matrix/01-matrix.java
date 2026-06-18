class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows =  mat.length;
        int cols = mat[0].length;

        int[][] ans = new int[rows][cols];
        boolean[][] visited = new boolean[rows][cols];

        Queue<Pair> q = new LinkedList<>();

        for(int i =0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(mat[i][j]==0)
                {
                    ans[i][j]=0 ;
                    visited[i][j] = true;
                    q.offer(new Pair(i, j, 0));
                }
               
            }
        }
   
          int[][] directions ={
                
                {-1,0},
                {0,-1},
                {1,0},
                {0,1},

          };
    
      while(!q.isEmpty())
      {
          Pair curr =q.poll();

       int   currrow = curr.row ;
         int currcol=curr.col;
         int  currdist=curr.dist ;
          
          for(int[]direction :directions)
          {
            int r = direction[0];
            int c = direction[1];

            int newrow= r+currrow;
            int newcol=c+currcol;

         // Check boundary conditions and if the neighbor is unvisited
                if (newrow >= 0 && newrow < rows && newcol >= 0 && newcol < cols && !visited[newrow][newcol]) {
                    visited[newrow][newcol] = true;
                    ans[newrow][newcol] = currdist + 1; // Neighbor's distance is current distance + 1
                    q.offer(new Pair (newrow, newcol, currdist + 1)); // Add neighbor to queue to expand further
                }

          }
      }

    return ans ;


    }


    class Pair{
        int row;
        int col;
        int dist;



        Pair(int row,int col ,int dist )
        {
            this.row = row ;
            this.col=col;
            this.dist=dist ;
        }
    }

}


