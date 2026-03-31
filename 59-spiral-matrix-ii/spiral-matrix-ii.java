class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int [n][n];

        int top=0;
        int left =0;
        int bottom = n-1;
        int right =n-1 ;
        int num=1;
        while(top<=bottom && left<=right)
        {
          ///left to right 

          for(int i=left ;i<=right;i++)
          {
            ans[top][i]=num;
            num++;
          }
          top++ ;

          //top to bottom 

          for(int i=top;i<=bottom;i++)
          {
            ans[i][right]=num;
            num++;
          }
          right--;
        
        if(top<=bottom)
        {
          //right to left 
          for(int i = right ;i>=left;i--)
          {
            ans[bottom][i]=num ;
            num++ ;
          }
          bottom-- ;
        }
         // bottom to top 
       if(left<=right)
       {
            for(int i =bottom ;i>=top;i--)
            {
                ans[i][left]=num;
                num++ ;
            }
            left++ ;
       }






        }

          return ans ;
    }
}