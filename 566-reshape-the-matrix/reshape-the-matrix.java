class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rowl = mat.length;
        int col = mat[0].length ;

        int[]  hold = new int[rowl*col];

        int[][] ans = new int[r][c] ;

          if (rowl * col != r * c) {
            return mat;
        }

 int k =0 ;


        for(int i =0 ;i<rowl;i++)
        {
            for(int j =0 ;j<col;j++)
            {
             hold[k]= mat[i][j];
             k++;
            }
        }
       k=0 ;
        for(int i =0 ;i<r;i++)
        {
            for(int j =0;j<c;j++)
            {
              ans[i][j] =hold[k];
              k++;
            }
        }

        return ans ;
    } 
}